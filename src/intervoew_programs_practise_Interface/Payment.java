package intervoew_programs_practise_Interface;

interface Payment {
	
	void processpayment(double amount);
	void genratedRecipt(String transac);

}

class CreditCardPayment implements Payment
{
	public void processpayment(double amount)
	{
		System.out.println("Payment is processing ="+amount);
	}
	public void genratedRecipt(String transac)
	{
		System.out.println("recipt will be generated -->"+transac);
	}
}

class phonePay implements Payment
{
	public void processpayment(double amount)
	{
		System.out.println("Payment has been processed ="+amount);
	}
	public void genratedRecipt(String transac)
	{
		System.out.println("recipt is generated -->"+transac);
	}
}