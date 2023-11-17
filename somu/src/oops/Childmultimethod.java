package oops;

public class Childmultimethod extends Parentmultimethod
{
	public void s1()
	{
		System.out.println("Childmultimethod");
		s4();
	}
	public static void s6()
	{
		System.out.println("java");
	}
	public static void s7()
	{
		System.out.println("automation");
		Grandparentmultimethod o = new Grandparentmultimethod();
		o.s1();
	}
	
	public static void main(String[] args)
	{
		//s7();
		//s6();
		//s5();
		//s4();
		//s2();
		Childmultimethod  j = new Childmultimethod();
		j.s1();
		//j.s3();
		Parentmultimethod k = new Parentmultimethod();
		//k.s1();
		Grandparentmultimethod l = new Grandparentmultimethod();
		//l.s1();
		

	}

}
