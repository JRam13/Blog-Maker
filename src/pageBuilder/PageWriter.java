package pageBuilder;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//============================================================
//This is a helper class that writes html files to the disk.
//This could be a Page Factory Method, however, for the sake
//of readability I made it its own class.
//============================================================
public class PageWriter {

	public PageWriter(String header, String body, String footer, String fileName) {
		
		File file = new File("html/"+fileName);
    	FileWriter fr = null;
    	BufferedWriter br;
		try {
			fr = new FileWriter(file);
			br = new BufferedWriter(fr);
			br.write(header);
			br.newLine();
			br.write(body);
			br.newLine();
			br.write(footer);
			br.newLine();
			br.close();
			
		} catch (IOException e) {
			System.out.println("Could not write file.");
		}
		
		//open file
		openFile(fileName);
		
	}

	//============================================================
	//Open file we just wrote (if supported)
	//============================================================
	private void openFile(String fileName) {
		
		if (Desktop.isDesktopSupported()) {
		    try {
		        File myFile = new File("html/"+fileName);
		        Desktop.getDesktop().open(myFile);
		    } catch (Exception ex) {
		        // no application registered for PDFs
		    }
		}
		
	}
	

}
