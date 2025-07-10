package programs_nterview_practise_FOR_LOOP;

import java.util.Scanner;

public class reverse_number {
	
	public static void main(String agrs[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number");
		int num= scan.nextInt();
		int temp=num;
		int reverse=0;
		while(temp!=0)
		{
			int digit = temp%10;
			reverse = reverse*10+digit;
			temp=temp/10;
		}
		System.out.println("Reverse number of the given number is ="+ reverse);
		
	}

}
