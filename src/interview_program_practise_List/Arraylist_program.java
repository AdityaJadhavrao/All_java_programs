package interview_program_practise_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arraylist_program {
	
	public static void main(String[] args) {
		
		List<String> al = new ArrayList();
		al.add("apple");
		al.add("banana");
		al.add("watermelon");
		al.add("mango");
		
		for(String fruit : al)
		{
			System.out.println(fruit);
		}
		
		List<Integer> num = new ArrayList<>(Arrays.asList(1,9,7,10,3,5));
		Collections.sort(num);
		System.out.println(num);
		
		Collections.reverse(num);
		System.out.println(num);
		
		List<String> list1 = new ArrayList<>(Arrays.asList("A" , "b"));
		List<String> list2 = new ArrayList<>(Arrays.asList("C" , "d"));
		list1.addAll(list2);
		System.out.println("Adding to ArrayLists : " + list1);
	}
	
		
	
}
