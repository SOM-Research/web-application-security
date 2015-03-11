package web.security.extractor.transformations;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.core.service.LauncherService;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;

import web.security.extractor.Utility;

public class ServletSecurity2PIM {

	private ILauncher launcher;
	private IProgressMonitor ip;
	
	private String psmPath;
	private String pimPath;
	
	public ServletSecurity2PIM(String servletPSMSecurityPath, String servletPIMSecurityPath) {
		this.psmPath = servletPSMSecurityPath;
		this.pimPath = servletPIMSecurityPath;
	}

	public void run() throws IOException, ATLCoreException {
		
		this.launcher = new EMFVMLauncher();
		this.ip = new NullProgressMonitor();
		
		Map<String,String> inModels = new HashMap<String,String>();
		inModels.put("IN", "SEC");
		
		Map<String, String> outModels = new HashMap<String, String>();
		outModels.put("OUT", "PIM");
		
		Map<String,String> paths = new HashMap<String,String>();
		paths.put("IN", URI.createFileURI(this.psmPath).toString());
		paths.put("OUT", URI.createFileURI(this.pimPath).toString());
		
		paths.put("SEC", Utility.SERVLET_SECURITY_METAMODEL_PATH);
		paths.put("PIM", Utility.WEB_SECURITY_METAMODEL_PATH);
		
		Map<String, Object> options = new HashMap<String, Object>();

		URL transformation  = this.getClass().getResource(Utility.SERVLET_SECURITY_2_PIM);
		
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
