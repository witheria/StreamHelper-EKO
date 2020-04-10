package helper;

/*
 * This class is special since it is used as a microprocessor to connect the other classes. 
 */

abstract class Backend {

	static int teampunkte = 0;
	static int gegnerpunkte = 0;
	static String streamlabspath = "";
	static String gegnername = "";
	static String gegnerkuerzel = "";
	static String caster = "";
	static String Art = "";
	static String FolderName = "StreamHelper";
	
	
	public static String getArt() {
		return Art;
	}
	public static void setArt(String art) {
		Art = art;
	}
	public static int getTeampunkte() {
		return teampunkte;
	}
	public static int getGegnerpunkte() {
		return gegnerpunkte;
	}
	public static String getStreamlabspath() {
		return streamlabspath;
	}
	public static String getGegnername() {
		return gegnername;
	}
	public static String getGegnerkuerzel() {
		return gegnerkuerzel;
	}
	public static String getCaster() {
		return caster;
	}
	public static void addChar(char a) {
		System.out.println(a);
	}
	
	public static String pathMaker(String path, String FolderName) {
		
		System.out.println(path + "\\" + FolderName);
		return path + "\\" + FolderName;
		
	}
	
	
	public static String update() {
		int[] g = new int[6];
		g[0] = Fileedit.write("Gegnerkuerzel", pathMaker(streamlabspath, FolderName), gegnerkuerzel);
		g[1] = Fileedit.write("Gegnername", pathMaker(streamlabspath, FolderName), gegnername);
		g[2] = Fileedit.write("caster",pathMaker(streamlabspath, FolderName), caster);
		g[3] = Fileedit.write("Art", pathMaker(streamlabspath, FolderName), Art);
		g[4] = Fileedit.write("EKOpunkte", pathMaker(streamlabspath, FolderName), teampunkte);
		g[5] = Fileedit.write("Gegnerpunkte", pathMaker(streamlabspath, FolderName), gegnerpunkte);
		

		
		for (int i = 0; i < g.length; i++) {
			if (g[i] == 0 ) {
				return Control.error + "Please specify a Streamlabs Path! Also make sure that all textfiles are created!";
			}
			
		}
		
		return Control.event + "Textfiles successfully updated!\r\n";

		
	}
	
	public static String createTextFiles() {
		int[] g = new int[6];
		g[0] = Fileedit.create("Gegnerkuerzel", pathMaker(streamlabspath, FolderName));
		g[1] = Fileedit.create("Gegnername", pathMaker(streamlabspath, FolderName));
		g[2] = Fileedit.create("caster", pathMaker(streamlabspath, FolderName));
		g[3] = Fileedit.create("Art", pathMaker(streamlabspath, FolderName));
		g[4] = Fileedit.create("EKOpunkte", pathMaker(streamlabspath, FolderName));
		g[5] = Fileedit.create("Gegnerpunkte", pathMaker(streamlabspath, FolderName));
		
		
		for (int i = 0; i < g.length; i++) {
			if (g[i] == 0 ) {
				return Control.error + "There was an error trying to create the textfiles at position " + i + ". Please make sure the path you specified is valid!\r\n";
				
			}
			if(g[i] == 2) {
				return Control.event + "Tried to create file but it already exists for index " + i + "\r\n";
			}
		}
		return Control.event + "Successfully created all textfiles!\r\n";
	}
	
	
	public static String deleteTextFiles() {
		int[] g = new int[6];
		g[0] = Fileedit.delete("Gegnerkuerzel", pathMaker(streamlabspath, FolderName));
		g[1] = Fileedit.delete("Gegnername", pathMaker(streamlabspath, FolderName));
		g[2] = Fileedit.delete("caster", pathMaker(streamlabspath, FolderName));
		g[3] = Fileedit.delete("Art", pathMaker(streamlabspath, FolderName));
		g[4] = Fileedit.delete("EKOpunkte", pathMaker(streamlabspath, FolderName));
		g[5] = Fileedit.delete("Gegnerpunkte", pathMaker(streamlabspath, FolderName));
		
		for (int i = 0; i < g.length; i++) {
			if (g[i] == 1) {
				
				return Control.error + "There was an error trying to delete the textfiles at position " + i +"\r\n" ; 
			}
		}
		
		return "EVENT: Successfully deleted all textfiles!\r\n";
	}

	@SuppressWarnings("deprecation")
	public static String returnlog() {
		String name = ("log-" +
				Control.time.getYear() +"-" + 
				Control.time.getMonth() +"-" + 
				Control.time.getDay() +"-" + 
				Control.time.getHours() + "-" + 
				Control.time.getMinutes());
		
		int f = Fileedit.create(name, streamlabspath);
		Fileedit.write(name, streamlabspath, Control.log);
//		if(Fileedit.testForFile(streamlabspath, name) == true) {
//			Fileedit.write(name, streamlabspath, Control.text);
//			System.out.println(Control.text);
//		}else {
//			return Control.error + "Please try again and make sure the path you specified is valid!";
//		}
		if (f == 0 ) {
			return Control.error + "An error occurred while creating the logfile. Specify a path and try again." +"\r\n";
			
		}
		return Control.event + "Successfully exported the logfile to " + streamlabspath;
		}

}


