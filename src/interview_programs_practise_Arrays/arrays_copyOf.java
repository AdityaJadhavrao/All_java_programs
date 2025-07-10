package interview_programs_practise_Arrays;

//import org.bouncycastle.util.Arrays;
import java.util.Arrays;  // Import the Arrays class
public class arrays_copyOf {

	public static void main(String args[])
	{
		int[] arr = {1, 2, 3, 4, 5};
		int copy [] = Arrays.copyOf(arr, 7);
		System.out.println(Arrays.toString(copy));
	}
}
