package oops;

public class Parentmultimethod extends Grandparentmultimethod
{
	public void s1()
	{
		System.out.println("Parentmultimethod");
	}
	public void s3()
	{
		System.out.println("testing");
		Childmultimethod j= new Childmultimethod();
		j.s1();
		//Childmultimethod.s6();
	}
	public static void s4()
	{
		System.out.println("engineer");
		//s2();
	}
	public static void s5()
	{
		System.out.println("role");
	}
	
}
