package web.security.checker.transformations;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

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

import web.security.checker.Utility;

public class CheckingUndeclareRoles {
	
	private ILauncher launcher;
	private IProgressMonitor ip;
	
	private String servletSecurityPath;
	private String undeclaredRolesPath;
	
	public CheckingUndeclareRoles(String servletSecurityPath, String undeclaredRolesPath) {
		this.servletSecurityPath = servletSecurityPath;
		this.undeclaredRolesPath = undeclaredRolesPath;
	}

	public void run() throws IOException, ATLCoreException {
		
		this.launcher = new EMFVMLauncher();
		this.ip = new NullProgressMonitor();
		
		Map<String,String> inModels = new HashMap<String,String>();
		inModels.put("IN", "PSM");
		
		Map<String, String> outModels = new HashMap<String, String>();
		outModels.put("OUT", "ANO");
		
		Map<String,String> paths = new HashMap<String,String>();
		paths.put("IN", URI.createFileURI(this.servletSecurityPath).toString());
		paths.put("OUT", URI.createFileURI(this.undeclaredRolesPath).toString());
		
		paths.put("PSM", Utility.SERVLET_SECURITY_METAMODEL_PATH);
		paths.put("ANO", Utility.ANOMALIES_METAMODEL_PATH);
		
		Map<String, Object> options = new HashMap<String, Object>();
		options.put("allowInterModelReferences", Boolean.TRUE);

		URL transformation  = this.getClass().getResource(Utility.CHECKING_UNDECLARED_ROLES);
		
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
