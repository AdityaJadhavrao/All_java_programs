package interview_programs_practise_Stream_API;

import java.util.Arrays;
import java.util.Scanner;

public class count_of_vowels {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the String");
		String s = scan.nextLine();
		
		long vowelcount = s.chars()
					.filter(c -> "aeiou".indexOf(c) != -1)
					.count();
		
		System.out.println("Count of voewl" +" " +vowelcount);
	}

}
