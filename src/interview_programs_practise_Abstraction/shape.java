package interview_programs_practise_Abstraction;

abstract class shape {
	
	abstract void calculatedArea();

}
class circle extends shape
{
	double radius;
	
	circle(double radius)
	{
		this.radius = radius;
	}
	void calculatedArea()
	{
		double area = Math.PI*Math.pow(radius, 2);
		System.out.println("area of circle is ="+area);
	}
}
class rectangle extends shape
{
	double  width;
	double length;
	rectangle(double length, double width)
	{
		this.length=length;
		this.width=width;
	}
	void calculatedArea()
	{
		double area = length*width;
		System.out.println("area of rectangle is ="+area);
	}
}
