package interview_porgams_practise_Fucntional_Interfaces;

import java.util.function.Consumer;

class ConsumerImpl implements Consumer<String>
{
	public void accept(String s)
	{
		System.out.println(s);
	}
}



public class consumer_Interface {
	
	public static void main(String args[])
	{
		Consumer<String> function = (s)->System.out.println(s);
		function.accept("Aditya");
	}

}
