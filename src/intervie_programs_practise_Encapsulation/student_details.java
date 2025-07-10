package intervie_programs_practise_Encapsulation;

public class student_details {
	
	private String name;
	private int rollnum;
	private char grade;
	
	public String getname()
	{
		return name;
	}
	public int getrollnum()
	{
		return rollnum;
	}
	public char getgrade()
	{
		return grade;
	}
	public void setname_roll(String name, int rollnum)
	{
		this.name = name;
		this.rollnum = rollnum;
	}
	public void setgrade(char grade)
	{
		if(grade>='A' && grade<='F')
		{
			this.grade = grade;
		}
		else
		{
			System.out.println("Invalid grade");
		}
	}
	public static void main(String args[])
	{
		student_details obj = new student_details();
		obj.setname_roll("Aditya ",24);
		obj.setgrade('G');
		System.out.println("Name"+"="+obj.getname());
		System.out.println("Rollnum"+"="+obj.getrollnum());
		System.out.println("Grade"+"="+obj.getgrade());
	}
}
