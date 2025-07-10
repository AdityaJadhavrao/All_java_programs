package interview_programs_practise_Arrays;

import java.util.Arrays;

public class largest_element_in_Array {
	
	public static void main(String args[])
	{
		int a[] = {1,2,300000,4,55,6,777,8888,9};
		
		int largest = Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			int num =a[i];
			if(num > largest)
			{
				largest = num;
			}
		}
		System.out.println("Largest array is the given Array is ="+largest);
	}
}
