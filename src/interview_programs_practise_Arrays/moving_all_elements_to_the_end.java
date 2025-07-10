package interview_programs_practise_Arrays;

import java.util.Arrays;

public class moving_all_elements_to_the_end {
	
	public static void main(String args[])
	{
		int arr1[] = {0,1,0,2,3,4,5,0};
		moveZeroToEnd(arr1);
		System.out.println(Arrays.toString(arr1));
	}
	public static void moveZeroToEnd(int arr[])
	{
		int index=0;
		
		for(int num:arr)
		{
			if(num!=0)
			{
				arr[index++]=num;
			}
		}
		while(index < arr.length)
		{
			arr[index++]=0;
		}
	}

}
