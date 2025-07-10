package interview_programs_practise_Method_Overloading;

public class area_calculation {
	
	public int area(int length, int width)
	{
		return length*width;
	}
	public double area(double base, double height)
	{
		return 0.5*base*height;
	}
	public double area(double radius)
	{
		return Math.PI*Math.pow(radius, 2);
	}
	public static void main(String args[])
	{
		area_calculation obj = new area_calculation();
		System.out.println(obj.area(2, 4));
		System.out.println(obj.area(3));
		System.out.println(obj.area(3, 5));
	}
	

}
