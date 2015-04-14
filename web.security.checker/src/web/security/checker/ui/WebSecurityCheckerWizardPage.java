package web.security.checker.ui;


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

public class WebSecurityCheckerWizardPage extends WizardPage {
	
	private Composite container;
	private Group selectJavaProjectSection;
	private Group selectWebXMLSection;
	private Group selectSecurityPropertiesSection;
	
	private org.eclipse.swt.widgets.List listJavaProjects;
	private ProjectSelectPageListener listener;
	private PropertySelectionListener propertyListener;
	private IProject selectedProject;
	private int currentProjectIndex = -1;
	
	private String webXMLDescriptorPath;
	
	private ResourceSelectionBox WebXML;
	
	private Button completeness, redundancy, shadowing, undeclared, reachability;
	private boolean selectionCompleteness, selectionRedundancy, selectionShadowing, selectionUndeclared, selectionReachability = false;

	protected WebSecurityCheckerWizardPage(String pageName) {
		super(pageName);
		super.setTitle("Web Security Checker for Java EE Applications");
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
		selectJavaProjectSection.setText("Select a Java EE project in the workspace");
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
		
		selectSecurityPropertiesSection = new Group(container, SWT.NULL);
		selectSecurityPropertiesSection.setText("Select properties to check"); //$NON-NLS-1$
		selectSecurityPropertiesSection.setLayout(new GridLayout());
		data = new GridData(GridData.FILL_HORIZONTAL);
		selectSecurityPropertiesSection.setLayoutData(data);
		
		propertyListener = new PropertySelectionListener(this);
		
		this.completeness = new Button(selectSecurityPropertiesSection, SWT.CHECK);
		this.completeness.setText("Completeness");
		this.completeness.addListener(SWT.Selection, propertyListener);
		
		this.redundancy = new Button(selectSecurityPropertiesSection, SWT.CHECK);
		this.redundancy.setText("Redundancy");
		this.redundancy.addListener(SWT.Selection, propertyListener);
		
		this.reachability = new Button(selectSecurityPropertiesSection, SWT.CHECK);
		this.reachability.setText("Rule Reachability");
		this.reachability.addListener(SWT.Selection, propertyListener);
		
		this.undeclared = new Button(selectSecurityPropertiesSection, SWT.CHECK);
		this.undeclared.setText("Undeclared Roles");
		this.undeclared.addListener(SWT.Selection, propertyListener);
		
		this.shadowing = new Button(selectSecurityPropertiesSection, SWT.CHECK);
		this.shadowing.setText("Rule Shadowing");
		this.shadowing.addListener(SWT.Selection, propertyListener);
		
		
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
	
	public boolean getCompleteness() {
		return this.selectionCompleteness;
	}
	
	public void setCompleteness(boolean value) {
		this.selectionCompleteness = value;
	}

	public boolean getRedundancy() {
		return this.selectionRedundancy;
	}

	public void setRedundancy(boolean value) {
		this.selectionRedundancy = value;
	}
	
	public boolean getShadowing() {
		return this.selectionShadowing;
	}
	
	public void setShadowing(boolean value) {
		this.selectionShadowing = value;
	}

	public boolean getUndeclared() {
		return this.selectionUndeclared;
	}
	
	public void setUndeclared(boolean value) {
		this.selectionUndeclared = value;
	}

	public boolean getReachability() {
		return this.selectionReachability;
	}
	
	public void setReachability(boolean value) {
		this.selectionReachability = value;
	}

}
