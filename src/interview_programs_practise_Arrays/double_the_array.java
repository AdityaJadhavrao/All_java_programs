package interview_programs_practise_Arrays;

import java.lang.reflect.Array;
import java.util.List;

public class double_the_array {
	
	public static void main(String args[])
	{
		int [] nums = {1,2,3,4,5};
		
		for(int i=0;i<nums.length;i++)
		{
			int sum = nums[i]*2;
			System.out.print(" " + sum);
		}
		
	}

}
