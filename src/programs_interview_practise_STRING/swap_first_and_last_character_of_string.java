package programs_interview_practise_STRING;

import java.util.Scanner;

public class swap_first_and_last_character_of_string {

	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the String");
		String s = scan.nextLine();
		s= s.toLowerCase();
	
		if(s.length()<=1)
		{
			System.out.println("Result ="+s);
		}
		else
		{
			char last= s.charAt(s.length()-1);
			char first= s.charAt(0);
			//char swap=' ';
			
			String swappedString = last+s.substring(1,s.length()-1)+first;
			System.out.println(swappedString);
		}
			
		
	}
}
