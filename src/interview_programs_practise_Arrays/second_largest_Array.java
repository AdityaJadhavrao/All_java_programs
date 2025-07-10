package interview_programs_practise_Arrays;

import java.util.Arrays;

public class second_largest_Array {
	
	public static void main(String args[])
	{
		int a[] = {4,2,3,6,810,34,2,6};
		
		int largest = Integer.MIN_VALUE;
		int second_largest = Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			int num = a[i];
			if(num>largest)
			{
				second_largest = largest;
				largest = num;
			}
			else if ( num > second_largest && num != largest)
			{
				second_largest = num;
			}
		}
		System.out.println("Second largest array is = "+ second_largest);
	}

}
