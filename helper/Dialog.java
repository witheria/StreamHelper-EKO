package helper;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;

import org.eclipse.swt.layout.GridData;
import org.eclipse.wb.swt.SWTResourceManager;

public class Dialog extends org.eclipse.swt.widgets.Dialog {

	protected Object result;
	protected Shell shell;

	/**
	 * Create the dialog.
	 * @param parent
	 * @param style
	 */
	public Dialog(Shell parent, int style) {
		super(parent, style);
		setText("SWT Dialog");
		createContents();
	}

	/**
	 * Open the dialog.
	 * @return the result
	 */
	public Object open() {
		shell.open();
		shell.layout();
		Display display = getParent().getDisplay();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		return result;
	}

	/**
	 * Create contents of the dialog.
	 */
	private void createContents() {
		shell = new Shell(getParent(), getStyle());
		shell.setSize(383, 171);
		shell.setText(getText());
		shell.setLayout(new GridLayout(6, false));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblDieFunktionDie = new Label(shell, SWT.NONE);
		lblDieFunktionDie.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.NORMAL));
		lblDieFunktionDie.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 5, 1));
		lblDieFunktionDie.setText("Sollen wirklich alle Textdateien gelöscht werden?");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Button btnNein = new Button(shell, SWT.NONE);
		GridData gd_btnNein = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_btnNein.widthHint = 71;
		btnNein.setLayoutData(gd_btnNein);
		btnNein.setText("Nein");
		new Label(shell, SWT.NONE);
		
		btnNein.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				Control.text = "";
				shell.close();
				
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	
		Button btnJa = new Button(shell, SWT.NONE);
		GridData gd_btnJa = new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1);
		gd_btnJa.widthHint = 70;
		btnJa.setLayoutData(gd_btnJa);
		btnJa.setText("Ja");
		
		btnJa.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				String g = Backend.deleteTextFiles();
				if(Backend.streamlabspath == "") {
					Control.text = (Control.error +" No path specified!"+ " \r\n");
				}else {
					Control.text = (g+ " \r\n");
				}
				shell.close();
				
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		

	}
}
