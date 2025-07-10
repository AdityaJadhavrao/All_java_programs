package programs_interview_practise_List;

import java.util.LinkedList;

public class Insert_element_At_first_end_middile_LinkedList {
	
	public static void main(String[] args) {
		
		LinkedList<String> obj = new LinkedList<>();
		obj.add("A");
		obj.addFirst("D");
		obj.addLast("C");
		obj.add(2,"X"); // Middle
		
		System.out.println("Updated list : " + obj);
		
	}

}
