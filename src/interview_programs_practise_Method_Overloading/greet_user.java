package interview_programs_practise_Method_Overloading;

public class greet_user {
	
	public String greet(String name)
	{
		return name;
	}
	public String greet(String name, int age)
	{
		return name+age;
	}
	public String greet(String name, String language)
	{
		return name+language;
	}
	public static void main(String agrs[])
	{
		greet_user obj = new greet_user();
		System.out.println(obj.greet("Aditya"));
		System.out.println(obj.greet("Aditya"+"="+ 30));
		System.out.println(obj.greet("Aditya"+"="+ "Marathi"));
	}

}
