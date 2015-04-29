package web.security.checker.logic;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmt.modisco.java.actions.DefaultDiscoverer;
import org.eclipse.gmt.modisco.java.actions.DiscoverJavaModelFromJavaProject;
import org.eclipse.gmt.modisco.xml.discoverer.actions.XMLModelDiscoverer;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.m2m.atl.core.ATLCoreException;

import anomalies.AnomaliesPackage;
import anomalies.Anomaly;
import web.security.checker.Utility;
import web.security.checker.transformations.CheckingCompleteness;
import web.security.checker.transformations.CheckingReachability;
import web.security.checker.transformations.CheckingRedundancy;
import web.security.checker.transformations.CheckingShadowing;
import web.security.checker.transformations.CheckingUndeclareRoles;
import web.security.checker.transformations.ExtractingServletSecurity;

public class Checker {
	
	private IProject javaProject;
	private IFile servletXMLDescriptor;
	
	private String javaProjectPath;
	private String servletXMLDescriptorPath;
	
	private String javaXMIProjectPath;
	private String servletXMIDescriptorPath;
	
	private String servletSecurityPSMPath;
	
	private String outputCompletenessPath, outputRedundancyPath, outputReachabilityPath, outputUndeclareRolesPath, outputShadowingPath, outputAnomalyCheckPath, outputAnomalyReportPath;
	
	private List<String> properties;
	
	
	public Checker(IProject javaProject, String web, List<String> properties) {
		this.javaProject = javaProject;
		this.javaProjectPath = this.javaProject.getLocation().toFile().getPath();
		this.javaXMIProjectPath = this.javaProjectPath + "\\" + this.javaProject.getName() + ".javaxmi";
		
		this.servletSecurityPSMPath = this.javaProjectPath + "\\" + this.javaProject.getName() + ".servlet.psm.xmi";
		
		this.outputCompletenessPath = this.javaProjectPath + "\\" + this.javaProject.getName() + ".check.completeness.xmi";
		this.outputRedundancyPath = this.javaProjectPath + "\\" + this.javaProject.getName() + ".check.redundancy.xmi";
		this.outputReachabilityPath = this.javaProjectPath + "\\" + this.javaProject.getName() + ".check.reachability.xmi";
		this.outputUndeclareRolesPath = this.javaProjectPath + "\\" + this.javaProject.getName() + ".check.undeclaredroles.xmi";
		this.outputShadowingPath = this.javaProjectPath + "\\" + this.javaProject.getName() + ".check.shadowing.xmi";
		
		this.outputAnomalyCheckPath = this.javaProjectPath + "\\" + this.javaProject.getName() + ".anomaly.check.xmi";
		this.outputAnomalyReportPath = this.javaProjectPath + "\\" + this.javaProject.getName() + ".anomaly.check.report";
		
		if (web != null) {		
			this.servletXMLDescriptorPath = this.getFullPath(web);
			this.servletXMIDescriptorPath = this.servletXMLDescriptorPath + ".xmi";
			this.servletXMLDescriptor = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(new Path(this.servletXMLDescriptorPath));	
		}
		
		this.properties = properties;
		
	}
	
	public String getFullPath(String path) {
		String output = "";
		if (path.startsWith("platform:/resource/")) {
			String workspacePath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toFile().getPath();
			String filePath = path.replaceAll("platform:/resource/", "");
			output = workspacePath + "\\" + filePath.replaceAll("/", "\\\\");
		}
		else if (path.startsWith("file:/")) {
			output = path.replaceAll("file:/", "");
		}
		
		return output;
	}
	
	public void execute() throws IOException, ATLCoreException, CoreException {
		//delete previous reports
		this.deleteFile(this.outputAnomalyCheckPath);
		this.deleteFile(this.outputAnomalyReportPath);
		this.refreshProjet();
		
		//create model representations of the Java code and XML descriptors
		this.generateModels();
		
		//populate the PSM Servlet model
		this.extractSecurityFromServlet();
		if (!this.properties.isEmpty())
			this.checkProperties();
		
		this.cleanProject();
		
	}
	
	public String getSecurityReport() {
		String message = "Property \"-\" Description \"Nothing to report!\"";
		IFile anomalyModelFile = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(new Path(this.outputAnomalyCheckPath));
		if (anomalyModelFile.exists()) {
			Resource anomalyModel = this.loadAnomalyModel(this.outputAnomalyCheckPath);
			if (!anomalyModel.getContents().isEmpty()) {
				message = "";
				for (EObject e : anomalyModel.getContents()) {
					Anomaly ano = (Anomaly)e;
					
					String toAdd = "Property \"" + e.eClass().getName() + "\"  Description \"" + ano.getDescription() + "\"\n";
					message = message + toAdd;
				}
			}
			else {
				message = "Property \"-\" Description \"Security properties passed with success, no warning to report!\"";
			}
		}
		
			
		return message;
			
	}
	
	public void saveSecurityReport() {
		IFile anomalyReportFile = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(new Path(this.outputAnomalyReportPath));
		InputStream is = new ByteArrayInputStream(this.getSecurityReport().getBytes());
		try {
			if (anomalyReportFile.exists())
				anomalyReportFile.delete(true, null);
			
			anomalyReportFile.create(is, true, null);
			this.refreshProjet();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	private Resource loadAnomalyModel(String path) {
		//load resource
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getPackageRegistry().put(AnomaliesPackage.eNS_URI, AnomaliesPackage.eINSTANCE);
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource resLoad = resSet.getResource(URI.createFileURI(path),true);		               
		
		try {
			resLoad.load(null);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
		
		return resLoad;
	}
	
	
	public void updateOutputAnomalyCheck(String propertyOutput, String output) {
		Resource anomalyModel = this.loadAnomalyModel(propertyOutput);
		Resource anomaliesModel = this.loadAnomalyModel(output);
		
		if (!anomalyModel.getContents().isEmpty()) {
			anomaliesModel.getContents().addAll(anomalyModel.getContents());
			try {
				anomaliesModel.save(Collections.EMPTY_MAP);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void checkCompleteness() {
		CheckingCompleteness transformation;
		transformation = new CheckingCompleteness(this.servletSecurityPSMPath, this.outputCompletenessPath);
		try {
			transformation.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void checkRedundancy() {
		CheckingRedundancy transformation;
		transformation = new CheckingRedundancy(this.servletSecurityPSMPath, this.outputRedundancyPath);
		try {
			transformation.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void checkReachability() {
		CheckingReachability transformation;
		transformation = new CheckingReachability(this.servletSecurityPSMPath, this.outputReachabilityPath);
		try {
			transformation.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	public void checkUndeclaredRoles() {
		CheckingUndeclareRoles transformation;
		transformation = new CheckingUndeclareRoles(this.servletSecurityPSMPath, this.outputUndeclareRolesPath);
		try {
			transformation.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	public void checkShadowing() {
		CheckingShadowing transformation;
		transformation = new CheckingShadowing(this.servletSecurityPSMPath, this.outputShadowingPath);
		try {
			transformation.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}		
	
	
	private void createOutputAnomalyModel() {
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getPackageRegistry().put(AnomaliesPackage.eNS_URI, AnomaliesPackage.eINSTANCE);
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource res = resSet.createResource(URI.createFileURI(this.outputAnomalyCheckPath));
		
		try {
			res.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void checkProperties() {
		this.createOutputAnomalyModel();
		for (String prop : this.properties) {		
			if (prop.equals("completeness")) {
				this.checkCompleteness();
				this.updateOutputAnomalyCheck(this.outputCompletenessPath, this.outputAnomalyCheckPath);
			}
			else if (prop.equals("redundancy")) {
				this.checkRedundancy();
				this.updateOutputAnomalyCheck(this.outputRedundancyPath, this.outputAnomalyCheckPath);
			}
			else if (prop.equals("reachability")) {
				this.checkReachability();
				this.updateOutputAnomalyCheck(this.outputReachabilityPath, this.outputAnomalyCheckPath);
			}
			else if (prop.equals("undeclared")) {
				this.checkUndeclaredRoles();
				this.updateOutputAnomalyCheck(this.outputUndeclareRolesPath, this.outputAnomalyCheckPath);
			}
			else if (prop.equals("shadowing")) {
				this.checkShadowing();
				this.updateOutputAnomalyCheck(this.outputShadowingPath, this.outputAnomalyCheckPath);
			}
		}
		
		
	}
	
	private void cleanProject() throws CoreException {
		
		this.refreshProjet();
		
		this.deleteFile(this.javaXMIProjectPath);
		this.deleteFile(this.servletXMIDescriptorPath);
		//this.deleteFile(this.servletSecurityPSMPath);
		this.deleteFile(this.outputCompletenessPath);
		this.deleteFile(this.outputReachabilityPath);
		this.deleteFile(this.outputRedundancyPath);
		this.deleteFile(this.outputUndeclareRolesPath);
		this.deleteFile(this.outputShadowingPath);
		
		this.refreshProjet();
	}
	
	private void deleteFile(String path) throws CoreException {
		IFile toDelete = null;
		try {
			toDelete = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(new Path(path));
			if (toDelete != null) {
				toDelete.delete(true, null);
			}
		}
		catch (Exception e) {}
	}
	
	private void refreshProjet() throws CoreException {
		this.javaProject.refreshLocal(IResource.DEPTH_INFINITE, null);
	}
	
	private void generateModels() throws IOException {
		this.generateModelCode(this.javaProject);
		if (this.servletXMLDescriptor != null)
			this.generateModelXML(this.servletXMLDescriptor);
	}
	
	public void extractSecurityFromServlet() throws IOException, ATLCoreException {
		ExtractingServletSecurity transformation;
		if (this.servletXMLDescriptor == null) 
			transformation = new ExtractingServletSecurity(this.javaXMIProjectPath, Utility.EMPTY_XMI_XML_PATH, this.servletSecurityPSMPath);
		else
			transformation = new ExtractingServletSecurity(this.javaXMIProjectPath, this.servletXMIDescriptorPath, this.servletSecurityPSMPath);
		transformation.run();
	}
	
	@SuppressWarnings("unchecked")
	public void generateModelCode(IProject project) throws IOException {
		IJavaProject javaProject = JavaCore.create(project);
		
		//Create a discoverer for a Java project
		DiscoverJavaModelFromJavaProject javaDiscoverer = new DiscoverJavaModelFromJavaProject();

		//Parameters of the discoverer
		@SuppressWarnings("rawtypes")
		Map javaDiscoveryParameters = new HashMap();
		javaDiscoveryParameters.put(DefaultDiscoverer.PARAMETER_SILENT_MODE, true);
		javaDiscoveryParameters.put(DefaultDiscoverer.PARAMETER_BROWSE_RESULT, false);

		//Execute the discoverer (javaProject is a IJavaProject) and serialize the model to <project_name>.javaxmi
		javaDiscoverer.discoverElement(javaProject, javaDiscoveryParameters);
		
		return;
	}
	
	@SuppressWarnings("unchecked")
	public void generateModelXML(IFile source) {

		XMLModelDiscoverer discoverer = new XMLModelDiscoverer(); 
		Map xmlDiscoveryParameters = new HashMap();
		xmlDiscoveryParameters.put(XMLModelDiscoverer.PARAMETER_SILENT_MODE, true);
		xmlDiscoveryParameters.put(XMLModelDiscoverer.PARAMETER_SERIALIZE_XMI, true);
		
		discoverer.discoverElement(source, xmlDiscoveryParameters);
		
	}
	
	
	
}