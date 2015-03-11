package web.security.extractor.transformations;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.internal.resources.File;
import org.eclipse.core.internal.resources.Workspace;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.core.service.LauncherService;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;

import web.security.extractor.Utility;

public class ExtractingServletSecurity {
	
	private ILauncher launcher;
	private IProgressMonitor ip;
	
	private String javaModelPath;
	private String webDescriptorModelPath;
	private String servletSecurityPath;
	
	public ExtractingServletSecurity(String javaPath, String webDescriptorPath, String servletSecurityPath) {
		this.javaModelPath = javaPath;
		this.webDescriptorModelPath = webDescriptorPath;
		this.servletSecurityPath = servletSecurityPath;
	}

	public void run() throws IOException, ATLCoreException {
		
		this.launcher = new EMFVMLauncher();
		this.ip = new NullProgressMonitor();
		
		Map<String,String> inModels = new HashMap<String,String>();
		inModels.put("IN", "XML");
		inModels.put("IN2", "JAVA");
		
		Map<String, String> outModels = new HashMap<String, String>();
		outModels.put("OUT", "SEC");
		
		Map<String,String> paths = new HashMap<String,String>();
		paths.put("IN", URI.createFileURI(this.webDescriptorModelPath).toString());
		paths.put("IN2", URI.createFileURI(this.javaModelPath).toString());
		paths.put("OUT", URI.createFileURI(this.servletSecurityPath).toString());
		
		paths.put("JAVA", Utility.JAVA_METAMODEL_PATH);
		paths.put("XML", Utility.XML_METAMODEL_PATH);
		paths.put("SEC", Utility.SERVLET_SECURITY_METAMODEL_PATH);
		
		Map<String, Object> options = new HashMap<String, Object>();

		URL transformation  = this.getClass().getResource(Utility.EXTRACTING_SERVLET_SECURITY);
		
		LauncherService.launch(ILauncher.RUN_MODE, 
							ip, 
							launcher, 
							inModels, 
							Collections.<String, String> emptyMap(),
							outModels, 
							paths, 
							options, 
							Collections.<String, InputStream> emptyMap(), 
							transformation.openStream());

	}
	
}
