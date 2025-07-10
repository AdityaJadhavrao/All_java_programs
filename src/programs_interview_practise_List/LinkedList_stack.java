package programs_interview_practise_List;

import java.util.LinkedList;

public class LinkedList_stack {
	public static void main(String[] args) {
		
		LinkedList<Integer> stack = new LinkedList<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.println("Popped : " + stack.pop());
		System.out.println("Stack now : " + stack);
	}

}
