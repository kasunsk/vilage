package user_interface;

import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.StatusLineManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Welcome extends ApplicationWindow {
	private Text user_name;
	private Text password;
	private Text test;

	/**
	 * Create the application window.
	 */
	public Welcome() {
		super(null);
		createActions();
		addToolBar(SWT.FLAT | SWT.WRAP);
		addMenuBar();
		addStatusLine();
	}

	/**
	 * Create contents of the application window.
	 * @param parent
	 */
	@Override
	protected Control createContents(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		
		Label lblUserName = new Label(container, SWT.NONE);
		lblUserName.setBounds(25, 35, 92, 17);
		lblUserName.setText("User Name");
		
		Label lblPassword = new Label(container, SWT.NONE);
		lblPassword.setBounds(25, 81, 70, 17);
		lblPassword.setText("Password");
		
		user_name = new Text(container, SWT.BORDER);
		user_name.setBounds(151, 35, 115, 27);
	//	 String user_name1 = (String) user_name;
		final String user_name1 = user_name.toString();
		
		password = new Text(container, SWT.BORDER);
		password.setBounds(151, 81, 115, 27);
		final String password1 = password.toString();
		
		Button btnSubmit = new Button(container, SWT.NONE);
		btnSubmit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(user_name1 == "kasun" && password1 == "pass"){
					test.setText("Done...");
				}
			}
		});
		btnSubmit.setBounds(151, 128, 91, 29);
		btnSubmit.setText("Submit");
		
		test = new Text(container, SWT.BORDER);
		test.setBounds(310, 50, 75, 27);

		return container;
	}

	/**
	 * Create the actions.
	 */
	private void createActions() {
		// Create the actions
	}

	/**
	 * Create the menu manager.
	 * @return the menu manager
	 */
	@Override
	protected MenuManager createMenuManager() {
		MenuManager menuManager = new MenuManager("menu");
		return menuManager;
	}

	/**
	 * Create the toolbar manager.
	 * @return the toolbar manager
	 */
	@Override
	protected ToolBarManager createToolBarManager(int style) {
		ToolBarManager toolBarManager = new ToolBarManager(style);
		return toolBarManager;
	}

	/**
	 * Create the status line manager.
	 * @return the status line manager
	 */
	@Override
	protected StatusLineManager createStatusLineManager() {
		StatusLineManager statusLineManager = new StatusLineManager();
		return statusLineManager;
	}

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			Welcome window = new Welcome();
			window.setBlockOnOpen(true);
			window.open();
			Display.getCurrent().dispose();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Configure the shell.
	 * @param newShell
	 */
	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("New Application");
	}

	/**
	 * Return the initial size of the window.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(441, 312);
	}
}
