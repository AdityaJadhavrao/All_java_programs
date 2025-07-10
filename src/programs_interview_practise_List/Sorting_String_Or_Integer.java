package programs_interview_practise_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting_String_Or_Integer {
	
	public static void main(String[] args) {
		
		List<Integer> obj = new ArrayList<>(Arrays.asList(2,4,5,6,1,12,2,12,4,3,3,42,23));
		Collections.sort(obj);  // sorting the array in ascending order
		System.out.println(obj);
		
		Collections.reverse(obj); // sorting the array in reverse order
		System.out.println(obj);
	}

}
