package pattern_programs;

import java.util.Scanner;

public class sqaure_pattern {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number");
		int num = scan.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num-1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
