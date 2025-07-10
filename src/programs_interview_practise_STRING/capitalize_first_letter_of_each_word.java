package programs_interview_practise_STRING;

import java.util.Scanner;

public class capitalize_first_letter_of_each_word {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the String");
		String s = scan.nextLine();
		
		s=s.toLowerCase();
		String str[] = s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			String store = str[i];
			
			System.out.print(store.toUpperCase().charAt(0)+ store.substring(1, store.length())+" ");
		}
	}

}
// Check for Anagram
// Take two strings as input and check if they are anagrams (contain the same characters in a different order).
