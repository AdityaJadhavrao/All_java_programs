package interview_programs_practise_Stream_API;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class capitalize_first_letter_of_each_word {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the String");
		String s = scan.nextLine();
		
		String result = Arrays.stream(s.toLowerCase().split("\\s"))
				.map(word -> Character.toUpperCase(word.charAt(0))+word.substring(1))
				.collect(Collectors.joining(" "));
		System.out.println(result);
	}

}
