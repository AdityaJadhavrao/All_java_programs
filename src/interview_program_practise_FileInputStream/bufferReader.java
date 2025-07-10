package interview_program_practise_FileInputStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class bufferReader {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\hp\\Documents\\testFile.txt"));
		
		//String data1 = br.readLine(); // reading only the first line
		//System.out.println(data1);
		
		String data2="";
		
		while((data2=br.readLine())!=null) // logic to read all the lines from the testFile.txt
		{
			System.out.println(data2);
		}
	}

}
