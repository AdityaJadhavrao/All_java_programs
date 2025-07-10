package interview_programs_practise_Stream_API;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class printing_reversing_of_array {
	
	public static void main(String args[])
	{
		int a[] = {2, 4, 6, 8, 10};

        List<Integer> list = Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(list);
	}
	
}
