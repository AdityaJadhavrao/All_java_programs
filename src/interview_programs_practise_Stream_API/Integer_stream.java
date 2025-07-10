package interview_programs_practise_Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Integer_stream {
	
	public static void main(String args[])
	{
		//example one printing numbers
		IntStream
		.range(1, 10)
		.forEach(System.out::print);
		System.out.println();
		
		//example two skipping numbers from 1 tp 5
		IntStream
		.range(1, 10)
		.skip(5)
		.forEach(x-> System.out.print(x));
		System.out.println();
		
		//example three printing sum of numbers
		System.out.println(
			IntStream
			.range(1, 10)
			.sum());
			
				
		//example four finding first name in the array
		Stream.of("Bhushan","Aditya","Jadhavrao","Lande")
		.sorted()
		.findFirst()
		.ifPresent(System.out::println);
		
		//example five filtering names with initials
		String[] name = {"Bhushan","Aditya","Jadhavrao","Lande"};
		Arrays.stream(name)
		.filter(x-> x.startsWith("B"))
		.sorted()
		.forEach(System.out::println);
		
		//example six printing averages of given numbers
		Arrays.stream(new int[] {2,4,6,8,10})
		.map(x -> x*x)
		.average()
		.ifPresent(System.out::println);
		
		//example printing String to lower case
		List<String> people = Arrays.asList("Aditya","Bhushan","Jadhavrao","Lande");
				people
				.stream()
				.map(String::toLowerCase)
				.filter(x -> x.startsWith("b"))
				.forEach(System.out::print);
				
		//example eight 
	}

}
