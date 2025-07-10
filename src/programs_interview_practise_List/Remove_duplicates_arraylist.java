package programs_interview_practise_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Remove_duplicates_arraylist {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>(Arrays.asList("Aditya","Bhushan","jadhavrao","lande","Aditya","Bhushan"));
		Set<String> obj = new LinkedHashSet<>(names);  //removes duplicate and preserves the insertion order
		System.out.println(obj);	
		
		List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,2,3,4,5));
		Set<Integer> obj1 = new LinkedHashSet<>(nums);  //removes duplicate and preserves the insertion order
		System.out.println(obj1);
	}

}
