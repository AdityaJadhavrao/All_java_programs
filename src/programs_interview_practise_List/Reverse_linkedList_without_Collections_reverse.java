package programs_interview_practise_List;

import java.util.Arrays;
import java.util.LinkedList;

public class Reverse_linkedList_without_Collections_reverse {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> nums =  new LinkedList<>(Arrays.asList(1,2,3,4,5,6));
		LinkedList<Integer> reverse = new LinkedList<>();
		
		for(int i = nums.size()-1; i>0; i--)
		{
			reverse.add(i);
		}
		System.out.println("Reversed : " + reverse);
	}

}
