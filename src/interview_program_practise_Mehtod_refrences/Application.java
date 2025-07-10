package interview_program_practise_Mehtod_refrences;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
	
	public static void main(String[] args) {
		
		List<Integer> num = List.of(1,2,3,4,5);
		num.forEach(System.out::println);
		
//		Greeter greeter = new Greeter();
//		List<String> family = List.of("Aditya","Bhushan","Jadhavrao","Lande");
//		//family.forEach(name -> greeter.greet(name));
//		family.forEach(greeter::greet); // ----> Method reference
		
		List<String> team = Arrays.asList("Prithvi","jadhavrao","Bhushan","lande");
		//team.sort((s1,s2)->s1.compareToIgnoreCase(s2));
		team.sort(String::compareToIgnoreCase); 
		System.out.println(team);
		
		List<String> people = Arrays.asList("Charlie","Bob","Dan");
		List<Greeter> newList = people.stream().map(Greeter::new).collect(Collectors.toList());
		System.out.println(newList);
	}

}
