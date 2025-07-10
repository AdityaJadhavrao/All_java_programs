package interview_porgams_practise_Fucntional_Interfaces;

import java.time.LocalDateTime;
import java.util.function.Supplier;

class SupplierImpl implements Supplier<LocalDateTime>
{
	public LocalDateTime get()
	{
		return LocalDateTime.now();
	}
}


public class supplier_Interface {

	public static void main(String args[])
	{
		Supplier<LocalDateTime> function = ()-> LocalDateTime.now();
		System.out.println(function.get());
	}
}
