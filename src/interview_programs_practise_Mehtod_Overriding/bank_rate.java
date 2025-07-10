package interview_programs_practise_Mehtod_Overriding;

class bank_rate {
	
	public static void main(String args[])
	{
		bank obj = new bank();
		bank obj1 = new SBI();
		bank obj2 = new HDFC();
		bank obj3 = new ICICI();
		
		obj.getInterestRate();
		obj1.getInterestRate();
		obj2.getInterestRate();
		obj3.getInterestRate();
	}

}
