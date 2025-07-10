package interview_porgams_practise_Fucntional_Interfaces;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class callable_interface implements Callable {

	int num ; 
	callable_interface(int num)
	{
		this.num = num;
	}
	@Override
	public Long call() throws Exception {
		
		long fact =1;
		
		for(int i=num;i>1;i--)
		{
			fact*=i;
		}
		return fact;
	}

}

class callable_demo
{
	public static void main(String args[]) throws InterruptedException, ExecutionException
	{
		callable_interface c = new callable_interface(5);
		ExecutorService serv = Executors.newFixedThreadPool(2);
		Future<Long> res = serv.submit(c);
		System.out.println(res.get());
		
	}
}