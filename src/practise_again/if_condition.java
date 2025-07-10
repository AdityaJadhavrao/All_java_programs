package practise_again;

import java.util.Scanner;

public class if_condition {
	
	
//	Online Shopping Cart Discount Validator
//	Take the total cart value and customer membership status (yes/no) as input.
//	Apply the following discount rules:
//	If the cart value is above ₹5000, apply a 10% discount.
//	If the customer is a premium member, apply an additional 5% discount.
//	If the cart value is below ₹500, print "Minimum order value should be ₹500".
//	Print the final amount after the discount.
	
	public static void main(String agrs[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the amount");
		double amt= scan.nextDouble();
		System.out.println("Customer membership status");
		String status = scan.next().toLowerCase();
		
		double discount = 0;
		
		double finalamt;
		
		if(amt<500)
		{
			System.out.println("Minimum order value should be 500/-");
		}
		else
		{
			discount = 0;
		}
		if(amt>5000)
		{
			discount = 0.10*amt;
		}
		if(status.equals("yes"))
		{		
			discount = 0.05*amt;
		}
		
		finalamt = amt - discount;
		System.out.println("Total discount of rupees = "+discount);
		System.out.println("Amount to pay = "+finalamt);
	}
}
