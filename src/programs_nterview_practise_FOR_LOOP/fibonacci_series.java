package programs_nterview_practise_FOR_LOOP;

import java.util.Scanner;

public class fibonacci_series {
	
	public static void main(String agrs[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number");
		int num = scan.nextInt();
		
		int first=0;
		int second=1;
		
		for(int i=1;i<=num;i++)
		{
			System.out.print(first+" ");
			int next = first+second;   //addition of 2 values
			first=second;             //assigining second value to first
			second=next;              //assigning output value in terms of next to second 
		}
		
	}

}
