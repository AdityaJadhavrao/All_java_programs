package practise_again;

public class Keyword_this {

	int a;
	
	public void mymthod(int a)
	{
		this.a = a;
		System.out.println("this is my local varibale "+a);
	}
	public void method2()
	{
		System.out.println("This is my instance variable = 20");
	}
	public static void main(String args[])
	{
		Keyword_this obj = new Keyword_this();
		obj.mymthod(10);
		obj.method2();
	}
}
