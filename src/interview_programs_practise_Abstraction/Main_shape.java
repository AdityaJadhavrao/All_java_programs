package interview_programs_practise_Abstraction;

public class Main_shape {
	
	public static void main(String argsp[])
	{
		shape obj = new circle(2.5);
		obj.calculatedArea();
		
		shape obj1 = new rectangle(3,4);
		obj1.calculatedArea();
	}

}
