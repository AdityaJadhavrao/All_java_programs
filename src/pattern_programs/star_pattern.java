package pattern_programs;

import java.util.Scanner;

public class star_pattern {

	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number");
		int num = scan.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}

// Would you like me to show a different pattern, like an inverted triangle or pyramid? Let me know! 🚀
