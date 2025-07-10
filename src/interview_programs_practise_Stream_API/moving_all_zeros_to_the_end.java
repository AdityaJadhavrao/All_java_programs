package interview_programs_practise_Stream_API;

import java.util.Arrays;
import java.util.stream.IntStream;

public class moving_all_zeros_to_the_end {
	
	
	public static void main(String args[])
	{
		 int arr1[] = {0, 1, 0, 2, 3, 4, 5, 0};
		 int arr2[]= moving_zeros(arr1);
	     System.out.println(Arrays.toString(arr2));
	}
	
	public static int[] moving_zeros(int arr[])
	{
		int [] nonzero = Arrays.stream(arr).filter(num -> num!=0).toArray();
		long zero = Arrays.stream(arr).filter(num -> num==0).count();
		
		return IntStream.concat(Arrays.stream(nonzero), IntStream.generate(()->0).limit(zero)).toArray();
	}

}
