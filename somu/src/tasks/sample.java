package tasks;

public class sample {

	public static void main(String[] args) {
		
		
		String ab ="it is an automation testing";
		char[] c = ab.toCharArray();
		int count =0;
		for( int i=0; i<=c.length-1;i++)
		{
			if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u')
			{
				System.out.println(c[i]);
				count++;
			}
			
		}
		
		System.out.println(count);
	
		
		
		
		
		
		
		
		
	}
}
