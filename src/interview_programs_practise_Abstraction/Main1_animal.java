package interview_programs_practise_Abstraction;

public class Main1_animal {
	
	public static void main(String args[])
	{
		animal obj = new dog("Barks");
		obj.makesound();
		
		animal obj1 = new cat("Meow");
		obj1.makesound();
	}

}
