package helper;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * So each method uses an exit code to determine whether it completed successfully or not. 
 * 
 * exit_code = 0 => The Method did not complete successfully, but it threw a standard level Exception
 * 
 * exit_code = 1 => The Method completed successfully
 * 
 * exit_code > 1 => The Method threw a Method specific Exception. Read the Method catches to learn more.
 * 
 * A method like "read" uses a different kind of this system. If the first char in the String returned is a "0", the Method failed and the String gets
 * passed to output. If the first char is not a number, the method completed successfully and the String needs to be worked with.
 * 
 */

 abstract class Fileedit {
	
	private static String escapePath(String path) {
		path  = path + "\\";
		return path.replace("\\", "\\\\");
	    
	}

	public static int create(String name, String path) {

		String doublepath = escapePath(path);
		int result = 0;
		
		System.out.println("EVENT: Created file: " + doublepath + name + ".txt");
		
		try {
			new File(doublepath).mkdirs();
	        File myObj = new File(doublepath + name + ".txt");
	        if (myObj.createNewFile()) {
	          System.out.println("File created: " + myObj.getName());
	          result = 1;
	        } else if(testForFile(doublepath, name + ".txt")) {
	        	System.out.println("File already exists.");
	          	result = 2;
	        }
	        
	      } catch (IOException e) {
	        System.out.println("An error occurred. Wrong path or no path specified!");
	        
	        result = 0;
	      }
		
		return result;
	}
	
	public static String read(String name, String path) {
		
		String doublepath = escapePath(path);
		String g = "";
		String line = null;
		
		try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(doublepath + name + ".txt");

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                g = g + line;
            	
            }   

            // Always close files.
            bufferedReader.close();
            
        }
        catch(FileNotFoundException ex) {
            g = (
                "1: Unable to open file '" + 
                name + ".txt" + "'");
            return g;
   
        }
        catch(IOException ex) {
            g = (
                "1: Error reading file '" 
                + name + ".txt" + "'");
            return g;
        }
		
		
		
		return g;
		
	}
	
	
	public static int write(String name, String path, String edit) {
		
		String fileName = escapePath(path) + name + ".txt";
		int exit_code = 0;
		
		try {
            // Assume default encoding.
            FileWriter fileWriter =
                new FileWriter(fileName);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);

            // Note that write() does not automatically
            // append a newline character.
            bufferedWriter.write(edit);

            // Always close files.
            bufferedWriter.close();
            exit_code = 1;
        }
        catch(IOException ex) {
           exit_code = 0;
        }
		return exit_code;
	}
	public static int write(String name, String path, int edit) {
		
		String fileName = escapePath(path) + name + ".txt";
		int exit_code = 1;
		
		try {
            // Assume default encoding.
            FileWriter fileWriter =
                new FileWriter(fileName);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);

            // Note that write() does not automatically
            // append a newline character.
            bufferedWriter.write(Integer.toString(edit));

            // Always close files.
            bufferedWriter.close();
           
        }
        catch(IOException ex) {
            exit_code = 0;
        }
		return exit_code;
	}
	
	public static int delete(String name, String path) {
		String doublepath = escapePath(path) + name + ".txt";
		int exit_code = 0;
		
		try {
			File f = new File(doublepath);
			f.delete();
		}
		catch (Exception e) {
			exit_code = 1;
		}
		return exit_code;
	}
	
	public static boolean testForFile(String path, String filename) {
		boolean returnvar = false;
		
		String doublepath = escapePath(path) + filename + ".txt";
		File f = new File(doublepath);
		if ((f.exists())) {
			returnvar = true;
		}
		
		
		return returnvar;
	}
	
}
