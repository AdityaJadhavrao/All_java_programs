package interview_program_practise_Set;

import java.util.HashSet;
import java.util.Scanner;

public class Unique_words {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the String");
		String str = scan.nextLine();
		String s[] = str.split(" ");
		HashSet<String> uniq = new HashSet<>();
		for(String words : s)
		{
			uniq.add(words);
		}
		System.out.println("unique words are : "+uniq);
	}
}
