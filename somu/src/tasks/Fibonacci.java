package tasks;

public class Fibonacci {

	public static void main(String[] args) 
	{
		
		int a=0;
		int b=1;
		for(int i=1;i<=7;i++)
		{
			int c=a+b;
			
			System.out.println(c);
			  //c=0+1=1
			//1+1=2
			a=b;  //0=1
			b=c;  //1=c
			
		}
		

	}

}
