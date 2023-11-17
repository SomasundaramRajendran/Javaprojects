package oops;

public class Childvar extends Parentvar
{
	int a=200;
	static String b= "automation testing";
	public void s1()
	{
		System.out.println(this.a);            //"this" keyword is used to call global variable in current class
		System.out.println(Childvar.b);
		System.out.println(super.a);           //"super" keyword is used to call global variable in previous class(parent class)
		System.out.println(Parentvar.b); 
	}
	public void s4()
	{
		double a=200.0;
		int b=2;
		double c=a/b;
		System.out.println(c);
	}
	public static void s5()
	{
		int a=50;
		float b=105.5f;
		float c=a*b;
		System.out.println(c);
		
	}
	public static void s6()
	{
		float a=150.5f;
		int b= 50;
		float c=a-b;
		System.out.println(c);
	}

	public static void main(String[] args)
	{
		//s5();
		//s6();
		//s3();
		Childvar j= new Childvar();
		//j.s1();
		//j.s4();
		//j.s2();
		Parentvar k=new Parentvar();
	 // k.s1();
	    
		
	

	}

}
