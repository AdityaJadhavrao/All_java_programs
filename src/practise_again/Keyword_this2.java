package practise_again;

public class Keyword_this2 {
	
	int age;
	String name;
	
	public int getage()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public String getname()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public static void main(String args[])
	{
		Keyword_this2 obj =  new Keyword_this2();
		obj.setAge(30);
		obj.setName("Aditya");
		System.out.print(obj.getage()+"="+obj.getname());
	}

}
