package interview_programs_practise_Stream_API;

import java.util.Arrays;
import java.util.stream.IntStream;

public class missing_numbers_in_array {
	
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5,6,8};
		System.out.println("Missing numbe is = "+missingnumber(arr,8));
		
	}
	public static int missingnumber(int arr[], int N)
	{
		int actual = N*(N+1)/2;
		int sum = Arrays.stream(arr).sorted().sum();
		
		return actual-sum;
	}

}
