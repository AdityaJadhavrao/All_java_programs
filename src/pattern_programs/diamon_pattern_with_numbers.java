package pattern_programs;

import java.util.Scanner;

public class diamon_pattern_with_numbers {
	
	 public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
			System.out.println("Please enter the number");
			int num =scan.nextInt();
			
			for(int i=1;i<=num;i++)
			{
				for(int j=1;j<=num-i;j++)
				{
					System.out.print("  ");
				}
				for(int k=1;k<=2*i-1;k++)
				{
					System.out.print(k+" ");
				}
				System.out.println();
			}
			for(int i=num-1;i>=1;i--)
			{
				for(int j=1;j<=num-i;j++)
				{
					System.out.print("  ");
				}
				for(int k=1;k<=2*i-1;k++)
				{
					System.out.print(k+" ");
				}
				System.out.println();
			}
	    }
}