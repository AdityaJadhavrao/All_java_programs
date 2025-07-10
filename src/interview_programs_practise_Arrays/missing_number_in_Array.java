package interview_programs_practise_Arrays;

public class missing_number_in_Array {
	
	public static void main(String args[])
	{
		int arr1[] = {1,2,4,5};
		
		System.out.println("Missing number in an array is ="+ missing_number(arr1,5));
		
		int arr2[] = {2,3,4,5,6};
		System.out.println("Missing number in second array is ="+missing_number(arr2,6));
	}
	
	public static int missing_number(int arr[] ,int N)
	{
		int missing = (N*(N+1))/2;
		int actualsum=0;
		 
		
		for(int i=0;i<arr.length;i++)
		{
			actualsum += arr[i];
		}
		
		return missing-actualsum;
	}

}
