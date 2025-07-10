package programs_nterview_practise_FOR_LOOP;

import java.util.Scanner;

public class factorial_number {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number");
		int num = scan.nextInt();
		int fact=1;
		for(int i=num;i>0;i--)
		{
			fact = fact*i;
		}
		System.out.println("Factorial of the given number is = "+fact);
	}

}
