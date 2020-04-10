package helper;


import java.util.Date;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;


class Control extends Composite {

	private Text text_pfad;
	private Text text_gegnername;
	private Text txtArt;
	private Text text_gegnerkuerzel;
	private Text text_caster;
	protected static Date time = new Date();
	static String event = " EVENT: ";
	static String error = "ERROR: ";
	protected static String text = "";
	protected static String log = "";
	
	
	public static void main(String[] args) {
	Display display = new Display();
	Shell shell = new Shell(display);
	shell.setLayout(new GridLayout(1, false));

	Control window = new Control(shell, SWT.NONE);

	shell.pack();
	shell.open();
	while (!shell.isDisposed()) {
		if (!display.readAndDispatch())
			display.sleep();
	}
	display.dispose();	
	}
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
public Control(Composite parent, int style) {
		
		super(parent, style);
		setLayout(new GridLayout(5, false));
		
		Label lblStreamhelper = new Label(this, SWT.NONE);
		lblStreamhelper.setFont(SWTResourceManager.getFont("Times New Roman CE", 15, SWT.BOLD));
		lblStreamhelper.setText("StreamHelper");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Label lblStreamlabsPfad = new Label(this, SWT.NONE);
		lblStreamlabsPfad.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblStreamlabsPfad.setText("Streamlabs Pfad");
		
		text_pfad = new Text(this, SWT.BORDER);
		text_pfad.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));
		
		Button btnAusZwischenablage_pfad = new Button(this, SWT.NONE);
		btnAusZwischenablage_pfad.setText("Aus Zwischenablage");
		
		
		new Label(this, SWT.NONE);
		
		Button btnErschaffeTextdateien = new Button(this, SWT.NONE);
		btnErschaffeTextdateien.setText("Erschaffe Textdateien");
		
		new Label(this, SWT.NONE);
		
		Button btndeleteTextdateien = new Button(this, SWT.NONE);
		btndeleteTextdateien.setText("L\u00F6sche Textdateien");
		
		
		new Label(this, SWT.NONE);
		
		Label lblArtDerVeranstaltung = new Label(this, SWT.NONE);
		lblArtDerVeranstaltung.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblArtDerVeranstaltung.setText("Art der Veranstaltung");
		
		txtArt = new Text(this, SWT.BORDER);
		txtArt.setText("bspw. Uniliga, 99 Damage usw");
		txtArt.setToolTipText("bspw. Uniliga, 99 Damage usw");
		txtArt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));
		
		Button btnAusZwischenablage_art = new Button(this, SWT.NONE);
		btnAusZwischenablage_art.setText("Aus Zwischenablage");
		
		
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Label lblNameGegnerteam = new Label(this, SWT.NONE);
		lblNameGegnerteam.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNameGegnerteam.setText("Name Gegnerteam");
		
		text_gegnername = new Text(this, SWT.BORDER);
		text_gegnername.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));
		
		Button btnAusZwischenablage_namegngnr = new Button(this, SWT.NONE);
		btnAusZwischenablage_namegngnr.setText("Aus Zwischenablage");
		
		Label lblKrzelGegnerteam = new Label(this, SWT.NONE);
		lblKrzelGegnerteam.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblKrzelGegnerteam.setText("Kuerzel Gegnerteam");
		
		text_gegnerkuerzel = new Text(this, SWT.BORDER);
		text_gegnerkuerzel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));
		
		Button btnAusZwischenablage_krzlgegner = new Button(this, SWT.NONE);
		btnAusZwischenablage_krzlgegner.setText("Aus Zwischenablage");
		
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Label lblCaster = new Label(this, SWT.NONE);
		lblCaster.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblCaster.setText("Caster");
		
		text_caster = new Text(this, SWT.BORDER);
		text_caster.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));
		
		Button btnAusZwischenablage_Caster = new Button(this, SWT.NONE);
		btnAusZwischenablage_Caster.setText("Aus Zwischenablage");
		
		
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button btnAktualisieren = new Button(this, SWT.NONE);
		btnAktualisieren.setText("Aktualisieren");
		new Label(this, SWT.NONE);
		
		Label lblPunktestand = new Label(this, SWT.CENTER);
		lblPunktestand.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 3));
		lblPunktestand.setText("Punktestand");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Label lblPunktestandEko = new Label(this, SWT.NONE);
		lblPunktestandEko.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 3));
		lblPunktestandEko.setText("Punktestand EKO");
		new Label(this, SWT.NONE);
		
		Label lblPunktestandGegner = new Label(this, SWT.NONE);
		lblPunktestandGegner.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 3));
		lblPunktestandGegner.setText("Punktestand Gegner");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Spinner spinnerEKO = new Spinner(this, SWT.BORDER);
		spinnerEKO.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 2));
		
		
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Spinner spinner_gegner = new Spinner(this, SWT.BORDER);
		spinner_gegner.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 2));

		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Composite composite = new Composite(this, SWT.NONE);
		GridData gd_composite = new GridData(SWT.LEFT, SWT.CENTER, false, false, 5, 4);
		gd_composite.widthHint = 538;
		gd_composite.heightHint = 86;
		composite.setLayoutData(gd_composite);
		
		 Text text = new Text(composite, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
		text.setBounds(0, 0, 538, 86);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Label lblNewLabel = new Label(this, SWT.NONE);
		lblNewLabel.setFont(SWTResourceManager.getFont("Segoe UI", 5, SWT.NORMAL));
		lblNewLabel.setText("(c) Toni Schmidbauer 2020");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button log = new Button(this, SWT.NONE);
		GridData gd_log = new GridData(SWT.RIGHT, SWT.CENTER, true, true, 1, 1);
		gd_log.heightHint = 24;
		log.setLayoutData(gd_log);
		log.setText("Als .txt exportieren");
		
		//Now all the Listeners
		
		//SPINNER
		//Listener for the gegnerpunkte spinner
		spinner_gegner.addModifyListener(new ModifyListener () {
			public void modifyText(ModifyEvent event) {
				Backend.gegnerpunkte = Integer.parseInt(spinner_gegner.getText());
				
				String g = Backend.update();
				timeUpdate();
				//text.append(time + " " +g + "\r\n");
				text.append(time + g + " " + "Set Gegnerpunkte to " + Backend.getTeampunkte() + " \r\n");
			}
		});
		//EKO Punkte Listener
		spinnerEKO.addModifyListener(new ModifyListener () {
			public void modifyText(ModifyEvent event) {
				Backend.teampunkte = Integer.parseInt(spinnerEKO.getText());
				String g = Backend.update();
				//text.append(Control.event + g);
				timeUpdate();
				//text.append(Control.event + "Successfully set teampunkte to " + Backend.getTeampunkte() + "\r\n");
				text.append(time+  g + " " + "Set Teampunkte to " + Backend.getTeampunkte() + " \r\n");
			}
		});
		
		//@BUTTONS
		
		//log listener
		log.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Control.log = text.getText();
				text.append(Backend.returnlog() + "\r\n");
			}
		});
		//Aktualisieren Listener
		btnAktualisieren.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String g = Backend.update();
				timeUpdate();
				text.append(time +" " + g + " \r\n");
			}
		});
		
		//Caster clipboard button
		btnAusZwischenablage_Caster.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				text_caster.setText(ClipboardEffects.getClipboard());
				timeUpdate();
				text.append(time + event + "Added " +"\"" + ClipboardEffects.getClipboard() + "\"" + " to Field: Caster!"+ " \r\n");
			}
		});
		
		//kuerzelgegner clipboard button
		btnAusZwischenablage_krzlgegner.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				text_gegnerkuerzel.setText(ClipboardEffects.getClipboard());
				timeUpdate();
				text.append(time + event + "Added " +"\"" + ClipboardEffects.getClipboard() + "\"" + " to Field: Gegnerkuerzel!"+ " \r\n");
			}
		});
		
		//namegegner clipboard button
		btnAusZwischenablage_namegngnr.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				text_gegnername.setText(ClipboardEffects.getClipboard());
				timeUpdate();
				text.append(time + event + "Added " +"\"" + ClipboardEffects.getClipboard() + "\"" + " to Field: Gegnername!"+ " \r\n");
			}
		});
		
		//art clipboard button
		btnAusZwischenablage_art.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				txtArt.setText(ClipboardEffects.getClipboard());
				timeUpdate();
				text.append(time + event + "Added " +"\"" + ClipboardEffects.getClipboard() + "\"" + " to Field: Spielart!"+ " \r\n");
			}
		});
		
		//delete textfiles button
		btndeleteTextdateien.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Dialog dialog = new Dialog(getShell(), SWT.NONE);
				dialog.open();
				timeUpdate();
				text.append(time + " " +Control.text);
				
			}
		});
		
		//create textfiles button
		btnErschaffeTextdateien.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				String g = Backend.createTextFiles();
				timeUpdate();
				text.append(time + g + "\r\n");
				if(Backend.streamlabspath == "") {
					//Dialog dialog = new Dialog(getShell(), SWT.NONE);
					timeUpdate();
					text.append(error +"No path specified!"+ " \r\n");
				}
			}
		});
		
		//pfad clipboard button
		btnAusZwischenablage_pfad.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				text_pfad.setText(ClipboardEffects.getClipboard());
				timeUpdate();
				text.append(time + event + "Added " +"\"" + ClipboardEffects.getClipboard() + "\"" + " to Field: Streamlabspfad"+ " \r\n");
				
			}
		});
		
		//TEXT
		//pfad
		text_pfad.addModifyListener(new ModifyListener () {
			public void modifyText(ModifyEvent event) {
				Backend.streamlabspath = text_pfad.getText();
				timeUpdate();
				text.append(time + Control.event + "Successfully set streamlabs to " + Backend.getStreamlabspath()+ " \r\n");
				
			}
		});
		
		//caster
		text_caster.addModifyListener(new ModifyListener () {
			public void modifyText(ModifyEvent event) {
				Backend.caster = text_caster.getText();
				timeUpdate();
				text.append(time + Control.event + "Successfully set castername to " + Backend.getCaster()+ " \r\n");
			}
		});
		
		//Art
		txtArt.addModifyListener(new ModifyListener () {
			public void modifyText(ModifyEvent event) {
				
				Backend.Art = txtArt.getText();
				timeUpdate();
				text.append(time + Control.event+ "Successfully set Art to " + Backend.getArt()+ " \r\n");
			}
		});
		
		//gegnerkuerzel
		text_gegnerkuerzel.addModifyListener(new ModifyListener () {
			public void modifyText(ModifyEvent event) {
				Backend.gegnerkuerzel = text_gegnerkuerzel.getText().toUpperCase();
				timeUpdate();
				text.append(time + Control.event + "Successfully set gegnerkuerzel to " + Backend.getGegnerkuerzel()+ " \r\n");
			}
		});
		
		//gegnername
		text_gegnername.addModifyListener(new ModifyListener () {
			public void modifyText(ModifyEvent e) {
				Backend.gegnername = text_gegnername.getText();
				timeUpdate();
				text.append(time + event + "Successfully set gegnername to " + Backend.getGegnername()+ " \r\n");
				
			}
		});
}



	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
	private static void timeUpdate() {
		
		Date ram = new Date();
		Control.time = ram;
	}
}
