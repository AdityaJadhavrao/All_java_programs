package programs_nterview_practise_FOR_LOOP;

import java.util.Scanner;

public class prime_number {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number");
		int num = scan.nextInt();
		int c=0;
		
		for(int i=2;i<=num-1;i++)
		{
			if(num%i==0)
			{
				c=1;
				break;
			}
		}
		if(c==0)
		{
			System.out.println("It is a prime number");
		}
		else
		{
			System.out.println("It is not a prime number");
		}
		
	}

}
