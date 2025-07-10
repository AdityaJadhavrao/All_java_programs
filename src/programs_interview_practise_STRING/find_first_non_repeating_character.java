package programs_interview_practise_STRING;

import java.util.Scanner;

public class find_first_non_repeating_character {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the String");
		String s = scan.next();
		s=s.toLowerCase();
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char one=s.charAt(i);
			int count=0;
			
			for(int j=0;j<=s.length()-1;j++)
			{
				if(s.charAt(j)==one)
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(one+" "+count);
				break; //   ------> break the condition and will print the first Character 
			}
		}
	}

}
