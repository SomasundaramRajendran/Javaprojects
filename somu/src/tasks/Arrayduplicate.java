package tasks;

public class Arrayduplicate {

	public static void main(String[] args) 
	{
		char ab[] = {'a','b','c','a','b','d','a','b','e','f','c','g','c','a','b','h'};
		for(int i=0;i<=ab.length-1;i++)
		{
			for( int j=i+1; j<ab.length;j++ )
			{
				if(ab[i] == ab[j])
				{
					System.out.println("Duplicate character is " + ab[i]);
					break;
				}
			}
		}

	}

}
