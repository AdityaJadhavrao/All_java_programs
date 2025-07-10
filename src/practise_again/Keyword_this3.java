package practise_again;

public class Keyword_this3 {

	int length;
	int width;
	
	Keyword_this3(int length, int width)
	{
		this.length = length;
		this.width = width;
	}
	int area()
	{
		return this.length*this.width;
	}
	public static void main(String args[])
	{
		Keyword_this3 obj = new Keyword_this3(10,5);
		System.out.println("Area of reactangle is = " + obj.area());
	}
	
}
