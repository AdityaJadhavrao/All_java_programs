package interview_program_practise_Set;

import java.util.Arrays;

public class Anagram_string {
	
	public static void main(String[] args) {
		
		String a = "silent";
		String b = "listen";
		
		if(a.length()!=b.length())
		{
			System.out.println("False string");
		}
		
		char [] c = a.toCharArray();
		char [] d = b.toCharArray();
		
		Arrays.sort(c);
		Arrays.sort(d);
		
		System.out.println(Arrays.toString(c)+ " : "+Arrays.toString(d));
		
		boolean result = Arrays.equals(c, d);
		System.out.println(result);
	}

}
