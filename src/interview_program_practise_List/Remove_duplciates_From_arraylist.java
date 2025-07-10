package interview_program_practise_List;

import java.util.*;

public class Remove_duplciates_From_arraylist {

	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<>(Arrays.asList(9,9,8,8,7,7,6,6,5,5,4,4,3,3,2,2));
		Set<Integer> set = new LinkedHashSet<>(al);
		System.out.print("Removing duplciates : "+ set + " ");
	}
}
