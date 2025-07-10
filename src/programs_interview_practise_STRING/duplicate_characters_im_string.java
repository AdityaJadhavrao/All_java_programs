	package programs_interview_practise_STRING;

import java.util.Scanner;

public class duplicate_characters_im_string {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the String");
		String s = scan.next();
		s =s.toLowerCase();
		char duplicate=' ';
		
		for(int i=0;i<=s.length()-1;i++)
		{
			duplicate = s.charAt(i);
			int count=0;
			
			for(int j=0;j<=s.length()-1;j++)
			{
				if(s.charAt(j)==duplicate)
				{
					count++;
				}
			}
			if(count>1 && s.indexOf(duplicate)==i) //if(count>=1 && s.indexOf(duplicate)==i) -->Printing occurrence of each Character in a String
			{
				System.out.println(duplicate+" "+count);
			}
		}
	}

}
