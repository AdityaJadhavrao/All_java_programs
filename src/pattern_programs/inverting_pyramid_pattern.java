package pattern_programs;

import java.util.Scanner;

public class inverting_pyramid_pattern {

	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number");
		int num = scan.nextInt();
		
		for(int i=num;i>=1;i--)
		{
			for(int j=1;j<=num-i;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
