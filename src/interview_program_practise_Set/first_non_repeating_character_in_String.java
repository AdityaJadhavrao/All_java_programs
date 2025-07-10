package interview_program_practise_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class first_non_repeating_character_in_String {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the String");
		String str = scan.next();
		char c=' ';
		for(int i=0;i<str.length();i++)
		{
			 c = str.charAt(i);
			 int count=0;
			 for(int j=0;j<str.length();j++)
			 {
				 if(c==str.charAt(j))
				 {
					 count++;
				 }
			 }
			 if(count==1)
			 {
				System.out.println(c);
				break;
			 }
		}
	}

}
