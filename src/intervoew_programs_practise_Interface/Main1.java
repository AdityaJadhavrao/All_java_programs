package intervoew_programs_practise_Interface;

public class Main1 {

	public static void main(String args[])
	{
		Payment obj = new CreditCardPayment();
		obj.processpayment(150.00);
		obj.genratedRecipt("PEDC123");
		
		Payment obj1 = new phonePay();
		obj1.processpayment(200.00);
		obj1.genratedRecipt("WDEF567");
	}

}
