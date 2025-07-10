package programs_nterview_practise_FOR_LOOP;

import java.util.Scanner;

public class sum_of_prime_numbers {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number");
		int num = scan.nextInt();
		int b=0;
		int c=0;
		
		for(int i=2;i<=num;i++)
		{
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0)
				{
					c=1; 
					break;
				}
			}
			if(c==0)
			{
				b=b+i;
			}
			else
			{
				c=0;
			}
		}
		System.out.println("Sum of prime numbers is = "+b);
		
	}

}
