package programs_interview_practise_STRING;

import java.util.Scanner;

public class removing_duplicate_string {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the string");
		String s= scan.nextLine();
		String str[] = s.split(" ");
		String word = " ";
		String print ="";
		for(int i=0;i<str.length;i++)
		{
			 word = str[i];
			 int count = 0;
			 for(int j=0;j<str.length;j++)
			 {
				 if(word.equals(str[j]))
				 {
					 count++;
				 }
			 }
			 if(count > 1 && !print.contains(word))
			 {
				 System.out.println("Duplicate words are : "+word);
				 print+=word;
			 }
		}
	}
}
