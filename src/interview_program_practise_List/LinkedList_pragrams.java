package interview_program_practise_List;

import java.util.LinkedList;

public class LinkedList_pragrams {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> obj = new LinkedList<>();
		obj.addFirst(1);
		obj.addLast(10);
		//System.out.println(obj);
		for(Integer linkedlist : obj)
		{
			System.out.println(linkedlist + " ");
		}
		
		obj.removeFirst();
		obj.removeLast();
		System.out.println(obj);
	}

}
