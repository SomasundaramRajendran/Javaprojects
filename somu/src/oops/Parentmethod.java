package oops;

public class Parentmethod {
	public void s1()
	{
		System.out.println("Parent method");
		Childmethod.s7();
	}
	public void s2()
	{
		System.out.println("Software");
	}
	public static void s3()
	{
		System.out.println("Testing");
		//Childmethod k = new Childmethod();
		//k.s6();
	}
	public static void s4()
	{
		System.out.println("manual");
		//Childmethod.s7();
	}

	

}
