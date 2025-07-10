package interview_porgrams_practise_Generics;

public class generic_class <T> {
	
	T id;
	
	public generic_class(T id)
	{
		this.id = id;
	}
	public String toString()
	{
		return ""+id;
	}
	public<T> void show(T id)
	{
		System.out.println(id);
	}

}

