package web.security.extractor.ui;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

public class WebSecurityExtractionWizard extends Wizard implements INewWizard {
	
	private WebSecurityExtractorWizardPage selectProjectAndXMLDescriptors;
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub
		
	}
	
	public WebSecurityExtractionWizard() {
		super();
		setNeedsProgressMonitor(true);
		setWindowTitle("Web Security Extractor"); //$NON-NLS-1$
	}
	

	@Override
	public void addPages() {
		selectProjectAndXMLDescriptors = new WebSecurityExtractorWizardPage("SelectProjectAndXMLDescriptors");
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
