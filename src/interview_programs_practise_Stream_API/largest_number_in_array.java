package interview_programs_practise_Stream_API;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class largest_number_in_array {
	
	public static void main(String args[])
	{
		int[] a = {1,2,3,4,5,6,80,123,3432,123213};
		int largest = Arrays.stream(a).max().orElseThrow();
		System.out.println(largest);
	}

}
