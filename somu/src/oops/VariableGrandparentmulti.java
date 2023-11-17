package oops;

public class VariableGrandparentmulti 
{
	int a=100;
	static String b="somu";
	
	public void s1()
	{
		System.out.println(this.a);
		System.out.println(VariableGrandparentmulti.b);
	}
	public static void s2()
	{
	  double a =200.0;
	  int b=50;
	  double c=a+b;
	  System.out.println(c);
	}
	public static void s3()
	{
		float a =105.5f;
		double b=202.0;
		double c=a+b;
		System.out.println(c);
		
	}
	
}
