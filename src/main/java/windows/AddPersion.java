package main.java.windows;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Button;

public class AddPersion {

	protected Shell shell;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			AddPersion window = new AddPersion();
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
		shell.setSize(506, 322);
		shell.setText("SWT Application");
		
		Label lblAddPersionsData = new Label(shell, SWT.NONE);
		lblAddPersionsData.setBounds(136, 24, 135, 28);
		lblAddPersionsData.setText("Add Persions Data");
		
		Label lblName = new Label(shell, SWT.NONE);
		lblName.setBounds(48, 65, 70, 17);
		lblName.setText("Name");
		
		Label lblIdNum = new Label(shell, SWT.NONE);
		lblIdNum.setBounds(48, 100, 70, 17);
		lblIdNum.setText("ID Num");
		
		Label lblSex = new Label(shell, SWT.NONE);
		lblSex.setBounds(48, 134, 70, 17);
		lblSex.setText("Sex");
		
		Label lblAddress = new Label(shell, SWT.NONE);
		lblAddress.setBounds(48, 175, 70, 17);
		lblAddress.setText("Address");
		
		Label lblTpNumber = new Label(shell, SWT.NONE);
		lblTpNumber.setBounds(48, 216, 83, 17);
		lblTpNumber.setText("TP Number");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(188, 55, 216, 27);
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(187, 90, 120, 27);
		
		Button btnMale = new Button(shell, SWT.RADIO);
		btnMale.setBounds(188, 134, 76, 24);
		btnMale.setText("Male");
		
		Button btnFemale = new Button(shell, SWT.RADIO);
		btnFemale.setBounds(290, 134, 114, 24);
		btnFemale.setText("Female");
		
		text_2 = new Text(shell, SWT.BORDER);
		text_2.setBounds(188, 175, 216, 27);
		
		text_3 = new Text(shell, SWT.BORDER);
		text_3.setBounds(188, 216, 216, 27);
		
		Button btnAdd = new Button(shell, SWT.NONE);
		btnAdd.setBounds(188, 262, 91, 29);
		btnAdd.setText("Add");
		
		Button btnClear = new Button(shell, SWT.NONE);
		btnClear.setBounds(299, 262, 91, 29);
		btnClear.setText("Clear");

	}
}
