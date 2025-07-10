package practise_again;

public class ClassContructor {
	
	String s;
	int age;
	ClassContructor()
	{
		s="aditya";
		age=30;
		System.out.println("My name is"+" "+s+ " "+ "and"+ " my age is "+ age );
	}
	public static void main(String args[])
	{
		new ClassContructor ();
	}
}
