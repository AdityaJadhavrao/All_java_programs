package interview_program_practise_FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileReader {

	public static void main(String[] args) throws IOException {
		
		
		FileReader r = new FileReader("C:\\Users\\hp\\Documents\\testFile.txt");
		int s=0;
		
		while((s=r.read())!=-1)
		{
			//char c;
			System.out.print((char)(s));
		}
		
	}
}
