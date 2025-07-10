package interview_program_practise_FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class fileOutputStream {
	
	public static void main(String[] args) throws IOException {
		
		String data = "This is a test lien to test FileOutputStream.\n";
		String data1 = "This is another line for testing";
		OutputStream output = new FileOutputStream("C:\\Users\\hp\\Documents\\outputStream.txt");
		byte[] content = data.getBytes();
		output.write(content);
		
		content = data1.getBytes(); // adding the another line store in data1
		output.write(content); // Rewriting the file with updated text		
		output.close();
	}

}
