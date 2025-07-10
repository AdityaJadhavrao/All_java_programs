package programs_nterview_practise_FOR_LOOP;

import java.util.Scanner;

public class leap_year {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the year");
		int year = scan.nextInt();
		
		if((year%4==0 && year%100!=0) || (year%400==0))
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not a Leap Year");
		}
	}

}
