package interview_programs_practise_Method_Overloading;

public class Calculator_program {
	
	public int add(int a, int b)
	{
		return a+b;
	}
	public int add(int a, int b,int c)
	{
		return a+b+c;
	}
	public double add(double a, double b)
	{
		return a+b;
	}
	public static void main(String args[])
	{
		Calculator_program obj = new Calculator_program();
		System.out.println(obj.add(1, 2));
		System.out.println(obj.add(1, 2, 3));
		System.out.println(obj.add(1.0, 2.0));
	}

}
