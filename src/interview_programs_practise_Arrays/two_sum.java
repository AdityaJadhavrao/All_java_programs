package interview_programs_practise_Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class two_sum {

	public static void main(String args[])
	{
		int num[] = {3,2,4};
		int target= 6;
		int[] result = twoSums(num,target);
		System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
	}
	public static int[] twoSums(int num[], int target)
	{
		HashMap<Integer,Integer> map =new HashMap();
		for(int i=0;i<num.length;i++)
		{
			int complement = target - num[i];
			if(map.containsKey(complement))
			{
				return new int [] {map.get(complement),i};
			}
			map.put(num[i], i);
		}
		return new int[] {};
	}
}
