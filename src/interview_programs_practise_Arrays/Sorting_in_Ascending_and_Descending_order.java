package interview_programs_practise_Arrays;

import java.util.Arrays;
import java.util.Collections;

public class Sorting_in_Ascending_and_Descending_order {
	
	public static void main(String[] args) {
		
		Integer a[] = {1,3,5,7,2,4,6,8};
		Arrays.sort(a);
		System.out.println("Sorting is ascending order : "+Arrays.toString(a));
		
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("Sorting array in descending order : "+Arrays.toString(a));
		
		//Ascending order
		int b[] = {1,3,5,7,2,4,6};
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]>b[j])
				{
					int temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
		System.out.println("Ascending order of b array is : "+Arrays.toString(b));
		
		//Descending Order
		for(int i=0;i<b.length/2;i++)
		{
			int temp  = b[i];
			b[i] = b[b.length-1-i];
			b[b.length-1-i] = temp;
		}
		System.out.println("Decending order of array b : "+Arrays.toString(b));
	}
}
