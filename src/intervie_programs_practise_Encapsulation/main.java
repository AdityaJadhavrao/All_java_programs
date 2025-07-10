package intervie_programs_practise_Encapsulation;

class main
{
	public static void main(String args[])
	{
		bank_account  obj = new bank_account();
		obj.setaccountnum(123456);
		obj.setbalance(10000000);
		
		System.out.println("Account number is ="+obj.getaccountNumber());
		System.out.println("Balance is ="+obj.getbalance());
	}
}