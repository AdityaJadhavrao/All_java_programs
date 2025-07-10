package practise_again;

public class Keyword_this4 {
	
	String brand;
	String model;

	Keyword_this4()
	{
		this("BMW","i8");
	}
	Keyword_this4(String brand , String model )
	{
		this.brand = brand;
		this.model = model;
		System.out.println("This is "+brand+" "+ "model is "+ model);
	}
	public static void main(String args[])
	{
		Keyword_this4 obj = new Keyword_this4();
	}
}
