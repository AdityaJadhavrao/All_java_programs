package programs_nterview_practise_FOR_LOOP;

import java.util.Scanner;

public class printing_prime_numbers {
	
	public static void main(String args[])
	{
		Scanner scan =  new Scanner(System.in);
		System.out.println("Please enter the number");
		int num = scan.nextInt();
		int c=0;
		
		for(int i=2;i<=num-1;i++)
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
				System.out.println("prime number = "+i);
			}
			else
			{
				System.out.println("not a prime number = "+i);
				c=0;
			}
		}
		
	}

}
