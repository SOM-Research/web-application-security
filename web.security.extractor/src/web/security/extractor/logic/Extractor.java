package web.security.extractor.logic;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import web.security.extractor.Activator;
import web.security.extractor.Utility;
import web.security.extractor.transformations.EjbSecurity2PIM;
import web.security.extractor.transformations.ExtractingEJBSecurity;
import web.security.extractor.transformations.ExtractingServletSecurity;
import web.security.extractor.transformations.ServletSecurity2PIM;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.gmt.modisco.java.actions.DefaultDiscoverer;
import org.eclipse.gmt.modisco.java.actions.DiscoverJavaModelFromJavaProject;
import org.eclipse.gmt.modisco.java.generation.files.GenerateJavaExtended;
import org.eclipse.gmt.modisco.xml.discoverer.actions.XMLModelDiscoverer;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.m2m.atl.core.ATLCoreException;

public class Extractor {
	
	private IProject javaProject;
	private IFile servletXMLDescriptor;
	private IFile ejbXMLDescriptor;
	
	private String javaProjectPath;
	private String servletXMLDescriptorPath;
	private String ejbXMLDescriptorPath;
	
	private String javaXMIProjectPath;
	private String servletXMIDescriptorPath;
	private String ejbXMIDescriptorPath;
	
	private String servletSecurityPSMPath;
	private String ejbSecurityPSMPath;
	
	private String servletSecurityPIMPath;
	private String ejbSecurityPIMPath;
	
	private String mergedPIMPath;

	
	public Extractor(IProject javaProject, String web, String ejb) {
		this.javaProject = javaProject;
		this.javaProjectPath = this.javaProject.getLocation().toFile().getPath();
		this.javaXMIProjectPath = this.javaProjectPath + "\\" + this.javaProject.getName() + ".javaxmi";
		
		this.servletSecurityPSMPath = this.javaProjectPath + "\\" + this.javaProject.getName() + ".servlet.psm.xmi";
		this.servletSecurityPIMPath = this.javaProjectPath + "\\" + this.javaProject.getName() + ".servlet.pim.xmi";
		
		this.ejbSecurityPSMPath = this.javaProjectPath + "\\" + this.javaProject.getName() + ".ejb.psm.xmi";
		this.ejbSecurityPIMPath = this.javaProjectPath + "\\" + this.javaProject.getName() + ".ejb.pim.xmi";
		
		this.mergedPIMPath = this.javaProjectPath + "\\" + this.javaProject.getName() + ".pim.xmi";
		
		if (web != null) {		
			this.servletXMLDescriptorPath = this.getFullPath(web);
			this.servletXMIDescriptorPath = this.servletXMLDescriptorPath + ".xmi";
			this.servletXMLDescriptor = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(new Path(this.servletXMLDescriptorPath));	
		}
		if (ejb != null) {
			this.ejbXMLDescriptorPath = this.getFullPath(ejb);
			this.ejbXMIDescriptorPath = this.ejbXMLDescriptorPath + ".xmi";
			this.ejbXMLDescriptor = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(new Path(this.ejbXMLDescriptorPath));
		}
		//Note that if web and ejb are null, the corresponding model representation is an empty xmi (Utility.EMPTY_XMI_XML_PATH)
		
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
		//create model representations of the Java code and XML descriptors
		this.generateModels();
		
		//populate the PSM models (Servlet and EBJ)
		this.extractSecurityFromServlet();
		this.extractSecurityFromEJB();
		
		//populate the PIM models (Servlet and EBJ)
		this.callEjbSecurity2PIM();
		this.callServletSecurity2PIM();
		
		//TODO: merge PIMS
		
		this.cleanProject();
		
	}
	
	private void cleanProject() throws CoreException {
		
		this.refreshProjet();
		
		this.deleteFile(this.javaXMIProjectPath);
		this.deleteFile(this.ejbXMIDescriptorPath);
		this.deleteFile(this.servletXMIDescriptorPath);
		this.deleteFile(this.ejbSecurityPSMPath);
		this.deleteFile(this.servletSecurityPSMPath);
		
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
		if (this.ejbXMLDescriptor != null)
			this.generateModelXML(this.ejbXMLDescriptor);
	}
	
	public void extractSecurityFromServlet() throws IOException, ATLCoreException {
		ExtractingServletSecurity transformation;
		if (this.servletXMLDescriptor == null) 
			transformation = new ExtractingServletSecurity(this.javaXMIProjectPath, Utility.EMPTY_XMI_XML_PATH, this.servletSecurityPSMPath);
		else
			transformation = new ExtractingServletSecurity(this.javaXMIProjectPath, this.servletXMIDescriptorPath, this.servletSecurityPSMPath);
		transformation.run();
	}
	
	public void extractSecurityFromEJB() throws IOException, ATLCoreException {
		ExtractingEJBSecurity transformation;
		if (this.ejbXMLDescriptor == null)
			transformation = new ExtractingEJBSecurity(this.javaXMIProjectPath, Utility.EMPTY_XMI_XML_PATH, this.ejbSecurityPSMPath);
		else
			transformation = new ExtractingEJBSecurity(this.javaXMIProjectPath, this.ejbXMLDescriptorPath, this.ejbSecurityPSMPath);
		transformation.run();
	}
	
	public void callEjbSecurity2PIM() throws IOException, ATLCoreException {
		EjbSecurity2PIM transformation = new EjbSecurity2PIM(this.ejbSecurityPSMPath, this.ejbSecurityPIMPath);
		transformation.run();
	}
	
	public void callServletSecurity2PIM() throws IOException, ATLCoreException {
		ServletSecurity2PIM transformation = new ServletSecurity2PIM(this.servletSecurityPSMPath, servletSecurityPIMPath);
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
