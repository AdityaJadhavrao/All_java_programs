package pattern_programs;

public class pyramid_pattern_with_characters {
	
	public static void main(String[] args) {
		
		int row=4;
		char c = 'a';
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1; j<=row-i; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++)
			{
				System.out.print(c);
			}
			System.out.println();
			c++;
		}
	}

}
