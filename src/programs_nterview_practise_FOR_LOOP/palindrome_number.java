package programs_nterview_practise_FOR_LOOP;

import java.util.Scanner;

public class palindrome_number {
	
	public static void main(String agrs[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number");
		int num = scan.nextInt();
		int temp=num;
		int palindrome=0;
		while(temp!=0)
		{
			int digit = temp%10;
			palindrome = palindrome*10+digit;
			temp=temp/10;
		}
		if(palindrome==num)
		{
			System.out.println("It is a palindrome number");
		}
		else
		{
			System.out.println("It is not a palindrome number");
		}
	}

}
