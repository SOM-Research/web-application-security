package web.security.checker.ui;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

public class PropertySelectionListener implements Listener {
	
	private WebSecurityCheckerWizardPage page;
	
	public PropertySelectionListener(WebSecurityCheckerWizardPage page) {
		this.page = page;
	}

	@Override
	public void handleEvent(Event event) {
		// TODO Auto-generated method stub
		Button pressed = (Button)event.widget;
		
		if (pressed.getText().equals("Completeness"))
			page.setCompleteness(true);
		else if (pressed.getText().equals("Redundancy"))
			page.setRedundancy(true);
		else if (pressed.getText().equals("Rule Reachability"))
			page.setReachability(true);
		else if (pressed.getText().equals("Undeclared Roles"))
			page.setUndeclared(true);
		else if (pressed.getText().equals("Rule Shadowing"))
			page.setShadowing(true);
		
	}

}
