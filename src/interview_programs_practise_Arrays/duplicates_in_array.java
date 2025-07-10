package interview_programs_practise_Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class duplicates_in_array {
	
public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(1,2,3,4,5,5,3,6,1,2);
		Set<Integer> n1 = new HashSet<>();
		Set<Integer> n2 = new HashSet<>();
		
		for(Integer nums : num)
		{
			if(!n1.add(nums))
			{
				n2.add(nums);
			}
		}
		if(!n2.isEmpty())
		{
			System.out.println("duplicates found : "+n2);
		}
		else
		{
			System.out.println("No duplicates found");
		}
		
	}

}
