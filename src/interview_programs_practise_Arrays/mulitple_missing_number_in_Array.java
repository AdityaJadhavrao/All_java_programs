package interview_programs_practise_Arrays;

import java.util.ArrayList;
import java.util.List;

public class mulitple_missing_number_in_Array {
	
	public static void main(String args[])
	{
		int arr1[] = {1,2,4,6,12};
		System.out.println("Missing number in given Arrays is ="+findMissingNumber(arr1,12));
	}
	
	public static List<Integer> findMissingNumber(int arr[],int N)
	{
		boolean [] present = new boolean[N+1];
		for(int num : arr)
		{
			present[num]=true;
		}
		
		List<Integer> missing = new ArrayList<>();
		
		for(int i=0;i<N;i++)
		{
			if(!present[i])
			{
				missing.add(i);
			}
		}
		return missing;
	}

}
