package abstruct;

public abstract class Parent 
{
	public void s1()
	{
		int a=10;
		float b= 55.5f;
		float c=a+b;
		System.out.println(c);
	}
	public static void s2()
	{
		double a=200.0;
		int b=50;
		double c=a-b;
		System.out.println(c);
	}
	public abstract void get();
	public abstract void maximize();
	public abstract void waitingstatement();
	public abstract void close();
	
}
