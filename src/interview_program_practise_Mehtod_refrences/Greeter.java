package interview_program_practise_Mehtod_refrences;

public class Greeter {
	
	private String s="";
	
//	public void greet(String name)
//	{
//		System.out.println("Hello "+ name);
//	}
	
	public Greeter(String s)
	{
		this.s =s;
	}
	public String getName()
	{
		return s;
	}
	public void setName(String s)
	{
		this.s = s;
	}

}
