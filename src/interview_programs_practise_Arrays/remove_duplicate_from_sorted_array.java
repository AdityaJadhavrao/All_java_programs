package interview_programs_practise_Arrays;

import java.util.Arrays;

public class remove_duplicate_from_sorted_array {
	
	public static void main(String args[])
	{
		int arr[] = {0,0,1,1,2,2,3,3,4,4};
		int k = removeDuplicates(arr);
		for(int i=0;i<k;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static int removeDuplicates(int []arr)
	{
		if(arr.length==0)
		{
			return 0;
		}
		int i=0;
		
		for(int j=1;j<arr.length;j++)
		{
			if(arr[i]!=arr[j])
			{
				i++;
				arr[i]=arr[j];
			}
		}
		return i+1;
	}

}
