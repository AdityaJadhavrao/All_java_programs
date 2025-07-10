package interview_programs_practise_Stream_API;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class duplicates_in_array {
	
	public static void main(String args[])
	{
		int a[] = {1, 1, 2, 3, 3, 4, 5, 3, 5, 6, 7, 8, 9, 9};
		Map<Integer,Long> frequency = Arrays.stream(a)
				.boxed()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("Duplicates in the given arrays are");
		
		frequency.entrySet().stream()
		.filter(entry -> entry.getValue()>1)
		.forEach(entry -> System.out.println(entry.getKey()));
		
	}

}
