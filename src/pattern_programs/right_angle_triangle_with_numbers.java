package pattern_programs;

public class right_angle_triangle_with_numbers {
	
	public static void main(String agrs[])
	{
		for(int i=4;i>=1;i--)   //For right angle triangle--> for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
