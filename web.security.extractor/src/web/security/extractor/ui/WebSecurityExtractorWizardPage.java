package web.security.extractor.ui;


import java.util.LinkedList;
import java.util.List;






import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

public class WebSecurityExtractorWizardPage extends WizardPage {
	
	private Composite container;
	private Group selectJavaProjectSection;
	private Group selectWebXMLSection;
	private Group selectEJBXMLSection;
	
	private org.eclipse.swt.widgets.List listJavaProjects;
	private ProjectSelectPageListener listener;
	private IProject selectedProject;
	private int currentProjectIndex = -1;
	
	private String webXMLDescriptorPath;
	private String ejbXMLDescriptorPath;
	
	private ResourceSelectionBox WebXML;
	private ResourceSelectionBox EJBXML;
	
	protected WebSecurityExtractorWizardPage(String pageName) {
		super(pageName);
		super.setTitle("Web Security Extractor for Java Applications");
		// TODO Auto-generated constructor stub
	}
	
	public int getCurrentProjectIndex() {
		return this.currentProjectIndex;
	}
	
	public ProjectSelectPageListener getListener() {
		return this.listener;
	}
	
	@Override
	public void createControl(Composite parent) {
		
		container = new Composite(parent, SWT.NULL);
			
		GridData data = new GridData(GridData.FILL_BOTH);
		container.setLayoutData(data);
		
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		
		selectJavaProjectSection = new Group(container, SWT.NULL);
		selectJavaProjectSection.setText("Select a Java project in the workspace");
		selectJavaProjectSection.setLayout(new GridLayout());
		selectJavaProjectSection.setLayoutData(data);
		
		listJavaProjects = new org.eclipse.swt.widgets.List (selectJavaProjectSection, SWT.BORDER | SWT.SINGLE | SWT.V_SCROLL);
		
		GridData  gridData = new GridData(GridData.FILL, GridData.FILL, true, true);
		listJavaProjects.setLayoutData(gridData);
		
		if (!getJavaProjectsInWorkspace().isEmpty()) {
		
			initJavaProjectList();
	        // create listener
	        listener = new ProjectSelectPageListener(this);
	        listJavaProjects.addListener(SWT.Selection, listener);
	        
		}
		
		
		selectWebXMLSection = new Group(container, SWT.NULL);
		selectWebXMLSection.setText("Select Web XML descriptor"); //$NON-NLS-1$
		selectWebXMLSection.setLayout(new GridLayout());
		data = new GridData(GridData.FILL_HORIZONTAL);
		selectWebXMLSection.setLayoutData(data);
		
		WebXML = new ResourceSelectionBox(getShell(), this);
		final Composite compositeWebXML = (Composite)WebXML.createDialogArea(selectWebXMLSection);
		compositeWebXML.getChildren()[compositeWebXML.getChildren().length - 1].dispose();
		
		compositeWebXML.setLayoutData(data);
		
		selectEJBXMLSection = new Group(container, SWT.NULL);
		selectEJBXMLSection.setText("Select EJB XML descriptor"); //$NON-NLS-1$
		selectEJBXMLSection.setLayout(new GridLayout());
		data = new GridData(GridData.FILL_HORIZONTAL);
		selectEJBXMLSection.setLayoutData(data);
		
		EJBXML = new ResourceSelectionBox(getShell(), this);
		final Composite compositeEJBXML = (Composite)EJBXML.createDialogArea(selectEJBXMLSection);
		compositeEJBXML.getChildren()[compositeEJBXML.getChildren().length - 1].dispose();
		
		compositeEJBXML.setLayoutData(data);
		
		dialogChanged();
		setControl(container);
		
	}
	
	private void initJavaProjectList() {
		listJavaProjects.removeAll();
		for(IProject JavaProject : getJavaProjectsInWorkspace())
	    	listJavaProjects.add(JavaProject.getName(), getJavaProjectsInWorkspace().indexOf(JavaProject));      
	}
	
	public List<IProject> getJavaProjectsInWorkspace() {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject[] projects = root.getProjects();
		
		List<IProject> javaProjects = new LinkedList<IProject>();
		
		for(int i = 0; i < projects.length; i++) {
			IProject p = projects[i];
			
			try {
				String[] natures = p.getDescription().getNatureIds();
				
				for(int j = 0; j < natures.length; j++) {
					if (natures[j].equals(JavaCore.NATURE_ID))
						javaProjects.add(p);
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}	
		}
		
		return javaProjects;
	}
	
	public IProject getJavaProjectByIndex(int index) {
		return getJavaProjectsInWorkspace().get(index);
	}
	
	
	public void dialogChanged() {
		//if there are not Java projects
		if (getJavaProjectsInWorkspace().isEmpty()) {
			updateStatus("No Java projects exist in the workspace");
			return;
		}
		
		if (this.selectedProject == null) {
			updateStatus("A Java project must be specified");
			return;
		}
		
		if (this.WebXML.getURIText() != null || !this.WebXML.getURIText().equals(" ")) {
			if (this.WebXML.getURIText().lastIndexOf(".") != -1) {
				if (!this.WebXML.getURIText().endsWith(".xml")) {
					updateStatus("Web XML descriptor extension must be \"xml\"");
					return;
				}
				else {
					this.webXMLDescriptorPath = this.WebXML.getURIText();
				}
			}
		}
		
		if (this.EJBXML.getURIText() != null || !this.EJBXML.getURIText().equals(" ")) {
			if (this.EJBXML.getURIText().lastIndexOf(".") != -1) {
				if (!this.EJBXML.getURIText().endsWith(".xml")) {
					updateStatus("EJB XML descriptor extension must be \"xml\"");
					return;
				}
				else {
					this.ejbXMLDescriptorPath = this.EJBXML.getURIText();
				}
			}
		}
		
		updateStatus(null);
		
	} 
	
	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	public void loadJavaProject() {
		this.selectedProject = getJavaProjectByIndex(listJavaProjects.getFocusIndex());
		this.setPageComplete(true);
	}
	
	public IProject getSelectedProject() {
		return this.selectedProject;
	}
	
	public String getWebXMLDescriptor() {
		return this.webXMLDescriptorPath;
	}
	
	public String getEJBXMLDescriptor() {
		return this.ejbXMLDescriptorPath;
	}

}
