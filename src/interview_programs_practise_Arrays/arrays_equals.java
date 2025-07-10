package interview_programs_practise_Arrays;

import java.util.Arrays;

public class arrays_equals {

	public static void main(String args[])
	{
		int a[] = {1,2,3,4};
		int b[] = {1,2,3,4};
		
		System.out.println(Arrays.equals(a, b));
		
		String s[] = {"apple" , "banana"};
		String d[]= {"watermelon" , "apple"};
		
		System.out.println(Arrays.equals(s, d));
	}
}
