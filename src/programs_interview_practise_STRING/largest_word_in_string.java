package programs_interview_practise_STRING;

import java.util.Scanner;

public class largest_word_in_string {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the String");
		String s = scan.nextLine();
		
		String str[] = s.split(" "); //This breaks the input string into an array of words, using spaces as the separator.
		String word="";
		
		for(int i=0;i<str.length;i++)
		{
			if(str[i].length() > word.length())
			{
				 word =str[i];
			}
		}
		System.out.println(word);
	}

}
