 package tasks;

public class Alphabetpattern {

	public static void main(String[] args)
	{
		for(int i=6;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				
				System.out.print((char) (j+64) +" ");
			}
			System.out.println();
		}
		

	}

}
