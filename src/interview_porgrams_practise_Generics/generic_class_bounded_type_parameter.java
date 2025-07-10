package interview_porgrams_practise_Generics;

public class generic_class_bounded_type_parameter <T extends Number>{
	
	private T number;
	
	public void setNumber(T number)
	{
		this.number=number;
	}
	public double doubleValue()
	{
		return number.doubleValue();
	}

}
