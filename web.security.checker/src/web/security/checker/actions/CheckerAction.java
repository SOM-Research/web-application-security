package web.security.checker.actions;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.jface.dialogs.MessageDialog;

import web.security.checker.logic.Checker;
import web.security.checker.ui.WebSecurityCheckerWizard;
import web.security.checker.ui.WebSecurityCheckerWizardPage;

/**
 * Our sample action implements workbench action delegate.
 * The action proxy will be created by the workbench and
 * shown in the UI. When the user tries to use the action,
 * this delegate will be created and execution will be 
 * delegated to it.
 * @see IWorkbenchWindowActionDelegate
 */
public class CheckerAction implements IWorkbenchWindowActionDelegate {
	private IWorkbenchWindow window;
	/**
	 * The constructor.
	 */
	public CheckerAction() {
	}
	
	private List<String> collectProperties(WebSecurityCheckerWizardPage page) {
		List<String> properties = new LinkedList<String>();
		
		boolean completeness = page.getCompleteness();
		boolean redundancy = page.getRedundancy();
		boolean reachability = page.getReachability();
		boolean undeclared = page.getUndeclared();
		boolean shadowing = page.getShadowing();
		
		if (completeness)
			properties.add("completeness");
		if (redundancy)
			properties.add("redundancy");
		if (reachability)
			properties.add("reachability");
		if (undeclared)
			properties.add("undeclared");
		if (shadowing)
			properties.add("shadowing");
		
		return properties;
			
	}

	/**
	 * The action has been activated. The argument of the
	 * method represents the 'real' action sitting
	 * in the workbench UI.
	 * @see IWorkbenchWindowActionDelegate#run
	 */
	public void run(IAction action) {
		
		try {
			WebSecurityCheckerWizard wizard = new WebSecurityCheckerWizard();
			WizardDialog dialog = new WizardDialog(window.getShell(), wizard);
			
			if (dialog.open() == Window.OK) {
				WebSecurityCheckerWizardPage page = (WebSecurityCheckerWizardPage)wizard.getPage("SelectProjectAndXMLDescriptors");
				IProject javaProject = page.getSelectedProject();
				String webXMLDescriptor = page.getWebXMLDescriptor();
				
				List<String> properties = new LinkedList<String>();
				properties = this.collectProperties(page);
				
				
				Checker ext = new Checker(javaProject, webXMLDescriptor, properties);
				ext.execute();
				ext.saveSecurityReport();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * Selection in the workbench has been changed. We 
	 * can change the state of the 'real' action here
	 * if we want, but this can only happen after 
	 * the delegate has been created.
	 * @see IWorkbenchWindowActionDelegate#selectionChanged
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	}

	/**
	 * We can use this method to dispose of any system
	 * resources we previously allocated.
	 * @see IWorkbenchWindowActionDelegate#dispose
	 */
	public void dispose() {
	}

	/**
	 * We will cache window object in order to
	 * be able to provide parent shell for the message dialog.
	 * @see IWorkbenchWindowActionDelegate#init
	 */
	public void init(IWorkbenchWindow window) {
		this.window = window;
	}
}