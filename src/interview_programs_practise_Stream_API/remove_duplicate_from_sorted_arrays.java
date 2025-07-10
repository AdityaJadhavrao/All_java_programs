package interview_programs_practise_Stream_API;

import java.util.Arrays;
import java.util.stream.IntStream;

public class remove_duplicate_from_sorted_arrays {
	
	public static void main(String args[])
	{
		int a[] = {1,2,3,3,4,5,6,6,7};
		
		int[] b = Arrays.stream(a).distinct().toArray();
		System.out.println(Arrays.toString(b));
	}

}
