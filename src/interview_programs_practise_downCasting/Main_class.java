package interview_programs_practise_downCasting;

public class Main_class {

	
	public static void main(String args[])
	{
	
		superclass obj = new subclass();
		subclass obj1 = (subclass) obj; //Downcasting ---> The superclass reference (obj) is downcast back to a SubClass reference 
		obj.sound();
		obj1.dog();
		obj1.waigTail();
		
		
	}
}
