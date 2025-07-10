package programs_interview_practise_STRING;

import java.util.Scanner;

public class palindrome_string {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the String");
		String s = scan.next();
		s=s.replaceAll("[^a-zA-Z]", "").toLowerCase();
		boolean palindrome = true;
		
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-1-i))
			{
				palindrome=false;
				break;
			}
		}
		if(palindrome==true)
		{
			System.out.println("Palindrome String");
		}
		else
		{
			System.out.println("Not a Palindrome String");
		}
	}

}

