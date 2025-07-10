package interview_programs_practise_Stream_API;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class actual_reversing_array {
	
	public static void main(String args[])
	{
		int a[] = {1,2,3,4,5,6};
		
		int reverse[] = reversearray(a);
		System.out.println(Arrays.toString(reverse));
	}
	
	public static int[] reversearray(int arr[])
	{
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		Collections.reverse(list);
		
		return list.stream().mapToInt(Integer::intValue).toArray();
	}
}
