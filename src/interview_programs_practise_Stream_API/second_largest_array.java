package interview_programs_practise_Stream_API;

import java.util.Arrays;
import java.util.Comparator;

public class second_largest_array {

	public static void main(String args[])
	{
		int a[] = {1,2,3,4,5,6,7,8,8,9};
		
		int secondLargest = Arrays.stream(a).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(Integer.MIN_VALUE);
		System.out.println(secondLargest);
	}
	
	
	
	
}
