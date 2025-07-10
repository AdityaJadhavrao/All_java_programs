package programs_interview_practise_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Remove_all_Even_numbers {
	
	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
		nums.removeIf(n -> n%2==0);
		System.out.println(nums);
	}
}
