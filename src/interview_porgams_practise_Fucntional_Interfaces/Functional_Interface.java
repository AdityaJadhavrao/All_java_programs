package interview_porgams_practise_Fucntional_Interfaces;

import java.util.function.Function;

import org.checkerframework.checker.units.qual.s;

class FunctionalImp implements Function<String,Integer>{
	
	public Integer apply (String s) { 
		return s.length();
	}
	
}


public class Functional_Interface {
	
	public static void main(String args[])
	{
		Function<String,Integer> function = (s)  ->  s.length();
		System.out.println(function.apply("Aditya"));
		
	}

}
