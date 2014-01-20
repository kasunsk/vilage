package main.java.windows;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Selection {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Selection window = new Selection();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		Button btnGo = new Button(shell, SWT.NONE);
		btnGo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnGo.setBounds(68, 131, 91, 29);
		btnGo.setText("Go");
		
		Button btnAddAPersion = new Button(shell, SWT.RADIO);
		btnAddAPersion.setBounds(32, 35, 114, 24);
		btnAddAPersion.setText("Add a Persion");
		
		Button btnAddAHome = new Button(shell, SWT.RADIO);
		btnAddAHome.setBounds(32, 65, 114, 24);
		btnAddAHome.setText("Add a Home");
		
		Button btnSerchAPersion = new Button(shell, SWT.RADIO);
		btnSerchAPersion.setBounds(189, 35, 145, 24);
		btnSerchAPersion.setText("Serch a Persion");
		
		Button btnSerchAHome = new Button(shell, SWT.RADIO);
		btnSerchAHome.setBounds(189, 65, 114, 24);
		btnSerchAHome.setText("Serch a Home");

	}
}
