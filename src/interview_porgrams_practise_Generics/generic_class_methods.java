package interview_porgrams_practise_Generics;

public class generic_class_methods {
	
	public static<T> void printArrays(T[] array)
	{
		for(T item : array)
		{
			System.out.print(item + " ");
		}
		System.out.println();
	}
}
