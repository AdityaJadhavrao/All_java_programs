package programs_nterview_practise_FOR_LOOP;

import java.util.Scanner;

public class armstrong_number {
	
	public static void main(String agrs[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please eneter the number");
		int num = scan.nextInt();
		int temp=num;
		int count=0;
		
		int length = String.valueOf(temp).length();
		
		while(temp!=0)
		{
			int digit = temp%10;
			count = (int) (count+Math.pow(digit, length)); //Math.pow returns the double, hence we have used (int)
			temp = temp/10;
		}
		if(count==num)
		{
			System.out.println("It is a Armstrong number");
		}
		else
		{
			System.out.println("It is not a Armstrong number");
		}
	}

}
