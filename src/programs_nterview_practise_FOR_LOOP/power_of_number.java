package programs_nterview_practise_FOR_LOOP;

import java.util.Scanner;

public class power_of_number {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the base");
		int base = scan.nextInt();
		System.out.println("Please enter the exponent");
		int exponent = scan.nextInt();
		int result=1;
		
		for(int i=1;i<=exponent;i++)
		{
			result = result*base;
		}
		System.out.println("Power of given number is = "+result);
	}

}
