package interview_program_practise_FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class fileInputStream {
	
	public static void main(String[] args) throws IOException {
		
		InputStream input = new FileInputStream("C:\\Users\\hp\\Documents\\testFile.txt");
		
		int count = input.available();
		System.out.println(count);
		
		byte[] content = new byte[100];
		input.read(content);
		
		String fileinput = new String(content);
		System.out.println(fileinput);
		
		input.close();
		System.out.println("File has been closed");
		
	}

}
