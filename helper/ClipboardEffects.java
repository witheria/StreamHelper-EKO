package helper;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;

public class ClipboardEffects {

	public static String getClipboard() {
		
		String g = "";
		
		try {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			Clipboard clipboard = toolkit.getSystemClipboard();
			String result = (String) clipboard.getData(DataFlavor.stringFlavor);
			g = result;
		}
		catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return g;
	}
	
	public static boolean setClipboard(String input) {
		
		boolean worked = false;
		
		try {
			String copyx = input;
			StringSelection stringSelection = new StringSelection(copyx);
			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			clipboard.setContents(stringSelection, null);
			worked = true;

		}catch (Exception e) {
			System.out.println(e.getMessage());
			worked = false;
		}
		return worked;

	}
}
