package interview_porgams_practise_Fucntional_Interfaces;

interface shape{
	
	void draw();
}



public class lambdaExpression {
	
	public static void main(String args[])
	{
		shape rectangle = () -> System.out.println("Shape is rectangle");
		rectangle.draw();
	}

}
