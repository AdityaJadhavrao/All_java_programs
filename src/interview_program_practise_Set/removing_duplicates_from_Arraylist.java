package interview_program_practise_Set;

import java.util.Arrays;
import java.util.HashSet;

import interview_porgrams_practise_Generics.Main;

public class removing_duplicates_from_Arraylist {
	
	public static void main(String[] args) {
		
		String arr[] = {"Selenium","Java","API","Selenium"};
		HashSet obj = new HashSet<>(Arrays.asList(arr));
		System.out.println(obj);
		
		Integer arr1[] = {1,2,3,4,5,2,3,4};
		HashSet<Integer> obj1 = new HashSet<>(Arrays.asList(arr1));
		System.out.println(obj1.toString());
		
	}
}
