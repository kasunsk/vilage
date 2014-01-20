package main.java.windows;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;

import main.java.windows.Selection;
import main.java.controler.*;

public class Welcome {
	
	Selection selection = new Selection();
	public static Welcome window = new Welcome();

	protected Shell shell;
	private Text text;
	private Text text_1;
	private Label label;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			//Welcome window = new Welcome();
			window.open();
			//window.createContents();
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
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(187, 104, 128, 27);

		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(187, 158, 128, 27);
		
		Label lblUserName = new Label(shell, SWT.NONE);
		lblUserName.setBounds(53, 114, 84, 17);
		lblUserName.setText("User Name");
		
		Label lblPassword = new Label(shell, SWT.NONE);
		lblPassword.setBounds(53, 168, 70, 17);
		lblPassword.setText("Password");
		
		Button btnSubmit = new Button(shell, SWT.NONE);
		btnSubmit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Control control = new Control();
				if(!(control.canEnter(text.getText(), text_1.getText()))){
					text.setText("");
					text_1.setText("");
					label.setText("User name or password is wrong...");
				}else{
				window.shell.close();
				selection.open();
				}
			}
		});
		btnSubmit.setBounds(187, 227, 91, 29);
		btnSubmit.setText("Submit");
		
		label = new Label(shell, SWT.NONE);
		label.setBounds(97, 26, 247, 27);
		

	}
}
