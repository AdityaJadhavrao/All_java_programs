package interview_program_practise_lambda_expression;

import java.util.Scanner;

interface Fucntional_interface
{

	public void print();
	
}

public class lambda_expression {
		
	public static void main(String args[])
	{
		Fucntional_interface obj = () -> 
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter the number");
			int num = scan.nextInt();
			int temp = num;
			int sum=0;
			while(temp!=0)
			{
				int digit = temp%10;
				sum+=digit;
				temp = temp/10;
			}
			System.out.println("sum of digits is = "+sum);
		};
		obj.print();
	}
}
