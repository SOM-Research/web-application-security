package web.security.checker.ui;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

public class WebSecurityCheckerWizard extends Wizard implements INewWizard {
	
	private WebSecurityCheckerWizardPage selectProjectAndXMLDescriptors;
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub
		
	}
	
	public WebSecurityCheckerWizard() {
		super();
		setNeedsProgressMonitor(true);
		setWindowTitle("Web Security Checker"); //$NON-NLS-1$
	}
	

	@Override
	public void addPages() {
		selectProjectAndXMLDescriptors = new WebSecurityCheckerWizardPage("SelectProjectAndXMLDescriptors");
		addPage(selectProjectAndXMLDescriptors);

	}

	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		return true;
	}
	
	public boolean performCancel() {
		// TODO Auto-generated method stub
		return true;
	}

}
