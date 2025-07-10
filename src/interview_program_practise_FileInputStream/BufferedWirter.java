package interview_program_practise_FileInputStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWirter {
	
	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\hp\\Documents\\bufferedwriteroutput.txt"));
		bw.write("This is the first line for buffered writer output. \n");
		bw.write("This is another line written for testing the new line");
		
		System.out.println("File content written successfully");
		bw.close();
	}

}
