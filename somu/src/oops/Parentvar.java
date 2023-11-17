package oops;

public class Parentvar 
{
	int a=100;
	static String b="testing";
	public void s1()
	{
		System.out.println(this.a);
		System.out.println(Parentvar.b);
		
	}
	public void s2()
	{
		double a=500.0;
		float b= 105.5f;
		double c=a+b;
		System.out.println(c);
	}
	public static void s3()
	{
		float a=200.5f;
		int b=5;
		float c=a*b;
		System.out.println(c);
	}

}
