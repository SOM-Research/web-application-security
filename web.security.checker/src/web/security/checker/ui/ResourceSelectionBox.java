/**
 * <copyright>
 *
 * Copyright (c) 2002-2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *   Obeo - code cleanup and tweaking for use within ATL
 *
 * </copyright>
 *
 * $Id: AtlResourceSelectionBox.java,v 1.2 2009/10/30 17:19:02 wpiers Exp $
 */
package web.security.checker.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.ui.action.LoadResourceAction.LoadResourceDialog;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

/**
 * Provide dialogs to get EMF metamodels URIs or path. This class originally came from plugin
 * <code>org.eclipse.emf.ecore.editor</code>.
 * 
 * @author <a href="mailto:william.piers@obeo.fr">William Piers</a>
 */
public class ResourceSelectionBox extends LoadResourceDialog {

	private Shell shell;
	private WebSecurityCheckerWizardPage page;
	
	/**
	 * Creates the dialogs.
	 * 
	 * @param parent
	 *            the parent shell
	 */
	public ResourceSelectionBox(Shell parent, WebSecurityCheckerWizardPage page) {
		super(parent);
		this.page = page;
		this.shell = parent;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.common.ui.dialogs.ResourceDialog#createDialogArea(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public Control createDialogArea(Composite parent) {
		
		Composite composite = (Composite)super.createDialogArea(parent);
		Composite buttonComposite = (Composite)composite.getChildren()[0];
		
		FormData data = new FormData();
		Control[] children = buttonComposite.getChildren();
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(children[0], -CONTROL_OFFSET);
		
		uriField.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				String text = uriField.getText();
				if (text.contains(" ")) { //$NON-NLS-1$
					String[] uris = text.split(" "); //$NON-NLS-1$
					if (uris.length > 0) {
						uriField.setText(uris[uris.length - 1]);
					}
				}
				
				page.dialogChanged();
			}
		});

		return composite;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.common.ui.dialogs.ResourceDialog#getURIText()
	 */
	@Override
	public String getURIText() {
		String res = super.getURIText();
		if (res != null && res.contains(" ")) { //$NON-NLS-1$
			res = res.split(" ")[0]; //$NON-NLS-1$
		}
		return res;
	}

	/**
	 * Sets the dialog text.
	 * 
	 * @param text
	 *            the text
	 */
	public void setText(String text) {
		uriField.setText(text);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.window.Window#getShell()
	 */
	@Override
	public Shell getShell() {
		return shell;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.common.ui.dialogs.ResourceDialog#isMulti()
	 */
	@Override
	protected boolean isMulti() {
		return false;
	}

}
