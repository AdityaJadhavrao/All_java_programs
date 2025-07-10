package programs_interview_practise_STRING;

import java.util.Scanner;

public class count_of_vowels {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the String");
		String s = scan.next();
		char store = ' ';
		int count=0;
		s=s.toLowerCase();
		for(int i=0;i<=s.length()-1;i++)
		{
			store = s.charAt(i);
			
			if(store=='a'||store=='i'||store=='o'||store=='u'||store=='e')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
