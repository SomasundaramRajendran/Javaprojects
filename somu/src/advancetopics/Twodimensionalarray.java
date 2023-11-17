package advancetopics;

public class Twodimensionalarray
{

	public static void main(String[] args)
	{
		int ab[][] = new int[3][3];
		ab[0][0] = 1;
		ab[0][1] = 2;
		ab[0][2] = 3;
		
		ab[1][0] = 4;
		ab[1][1] = 5;
		ab[1][2] = 6;
		
		ab[2][0] = 7;
		ab[2][1] = 8;
		ab[2][2] = 9;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++) 
			{
			System.out.print(ab[i][j]+ "  ");
			}
			System.out.println();
		}
		

	}

}
