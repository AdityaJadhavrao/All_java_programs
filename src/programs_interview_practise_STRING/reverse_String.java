package programs_interview_practise_STRING;

import java.util.Scanner;

public class reverse_String {
	
	public static void main(String agrs[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the String");
		String s = scan.next();
		char store = ' ';
		
		for(int i=s.length()-1;i>=0;i--)
		{
			store = s.charAt(i);
			System.out.print(store);
		}
		
	}

}
