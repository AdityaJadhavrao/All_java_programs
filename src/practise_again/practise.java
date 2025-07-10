package practise_again;

import java.util.Scanner;

public class practise {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("please provide me the natural number");
		int num = scan.nextInt();
		int count=0;
		int temp=num;
		while(temp!=0)
		{
			int a = temp%10;
			count = count*10+a;
			temp = temp/10;
		}
		System.out.println(count);
	}
}
