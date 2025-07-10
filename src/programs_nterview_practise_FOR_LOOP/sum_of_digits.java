package programs_nterview_practise_FOR_LOOP;

import java.util.Scanner;

public class sum_of_digits {

	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the digit");
		int num = scan.nextInt();
		int temp=num;
		int sum=0;
		while(temp!=0)
		{
			int digit = temp%10;
			sum=sum+digit;
			temp = temp/10;
		}
		System.out.println("Sum of the given digit is = "+sum);
	}
}
