package interview_programs_practise_Mehtod_Overriding;

class bank {
	
	public void getInterestRate()
	{
		System.out.println("Bank rates of different banks are ...");
	}
}
class SBI extends bank
{
	public void getInterestRate()
	{
		System.out.println("SBI bank rate 8%");
	}
}
class HDFC extends bank
{
	public void getInterestRate()
	{
		System.out.println("HDFC bank rate 9%");
	}
}
class ICICI extends bank
{
	public void getInterestRate()
	{
		System.out.println("ICICI bank rate 10%");
	}
}
