package interview_programs_practise_Threads;

public class MyThread extends Thread{
	
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

class MyThread2 extends Thread
{
	
	public void run()
	{
		for(int i=6;i<=10;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

class Thread3 implements Runnable
{
	public void run()
	{
		for(int i=10;i<=15;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


class Thread4 implements Runnable
{
	public void run()
	{
		for(int i=15;i<=20;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}