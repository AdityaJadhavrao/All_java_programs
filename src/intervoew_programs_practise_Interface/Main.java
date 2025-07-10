package intervoew_programs_practise_Interface;

public class Main {

	public static void main(String args[])
	{
		Sports obj =new cricket();
		obj.startgame();
		obj.endgame();
		
		Sports obj1 = new football();
		obj1.startgame();
		obj1.endgame();
	}
}
