package web.security.checker;

import org.eclipse.core.runtime.Platform;

public class Utility {
	private static final String metamodelsFolder = "metamodels/";
	private static final String resourcesFolder = "res/";
	private static final String transformationsFolder = "transf/";
	
	public static final String JAVA_METAMODEL_PATH = "http://www.eclipse.org/MoDisco/Java/0.2.incubation/java";
	public static final String XML_METAMODEL_PATH = "http://www.eclipse.org/MoDisco/Xml/0.1.incubation/XML";
	public static final String SERVLET_SECURITY_METAMODEL_PATH = getLocation() + metamodelsFolder + "ServletSecurity.ecore";
	public static final String ANOMALIES_METAMODEL_PATH = getLocation() + metamodelsFolder + "anomalies.ecore";
	public static final String EMPTY_XMI_XML_PATH = getLocation().replaceFirst("file:/", "") + resourcesFolder + "empty_xml.xmi";
	public static final String EMPTY_XMI_JAVA_PATH = getLocation().replaceFirst("file:/", "") + resourcesFolder + "empty_java_project.xmi";
	
	public static final String EXTRACTING_SERVLET_SECURITY = "/" + transformationsFolder + "extractingServletSecurity.asm";
	public static final String CHECKING_COMPLETENESS = "/" + transformationsFolder + "checkingCompleteness.asm";
	public static final String CHECKING_REDUNDANCY = "/" + transformationsFolder + "checkingRedundancy.asm";
	public static final String CHECKING_UNDECLARED_ROLES = "/" + transformationsFolder + "checkingUndeclared.asm";
	public static final String CHECKING_REACHABILITY = "/" + transformationsFolder + "checkingReachability.asm";
	public static final String CHECKING_SHADOWING = "/" + transformationsFolder + "checkingShadowing.asm";

	
	public static final String getLocation() {	
		return Platform.getBundle(Activator.PLUGIN_ID).getLocation().replaceFirst("reference:", "");
	}

}
