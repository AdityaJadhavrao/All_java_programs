package interview_programs_practise_Arrays;

public class reverse_array {
	
	public static void main(String args[])
	{
		int a[] = {2,4,6,8,10};
		
		int start=0;
		int end =a.length-1;
		
		while(start<end)
		{
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			
			start++;
			end--;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}
	}
}
