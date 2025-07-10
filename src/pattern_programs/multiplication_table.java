package pattern_programs;

import java.util.Scanner;

public class multiplication_table {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number");
		int n = scan.nextInt();
		
		 for(int i=1;i<=n;i++)
		 {
			 for(int j=1;j<=n;j++)
			 {
				 System.out.print(i*j+" ");
			 }
			 System.out.println();
		 }
	}
}