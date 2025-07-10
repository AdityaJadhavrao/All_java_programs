package programs_nterview_practise_FOR_LOOP;

import java.util.Scanner;

public class counting_number_of_digit {
	
	public static void main(String agrs[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number");
		int num = scan.nextInt();
		int count=0;
		int temp = num;
		while(temp!=0)
		{
			temp=temp/10;
			count++;
		}
		System.out.println("Count of digit is ="+count);
		
		// Another method for counting number of digits
		
		// int length = String.valueOf(temp).length();
		//System.out.println("Count of digit is = "+length);
	}

}
