package programs_nterview_practise_FOR_LOOP;

import java.util.Scanner;

public class greatest_common_divisor {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number (N1)");
		int n1= scan.nextInt();
		System.out.println("Please enter number (N2)");
		int n2= scan.nextInt();
		
		int gcd = 0;
		
		for(int i=1;i<=n1 && i<=n2;i++)
		{
			if(n1%i==0 && n2%i==0)
			{
				gcd=i;
			}
		}
		System.out.println("Greatest common divisor is ="+gcd);
	}

}
