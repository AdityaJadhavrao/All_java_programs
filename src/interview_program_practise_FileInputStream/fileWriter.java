package interview_program_practise_FileInputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {
	
	public static void main(String[] args) throws IOException {
		
		String str = "This is demo line in the file ";
		String str2 = "\nThis line is for appending";
		
		String filepath = System.getProperty(("user.dir"));
		
		File file = new File(filepath,"textfile.txt");
		
		FileWriter fr = new FileWriter(file,true);
		//fr.write(str); // Writing the first String
		fr.write(str2); //Appending the second string
		fr.flush(); //using Flush Stream get close temporarily but we can write the the file even after flush()
		fr.close(); // Stream gets close permanently, wee can write the file after close()
	}

}
