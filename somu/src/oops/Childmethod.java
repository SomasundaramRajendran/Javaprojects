package oops;

public class Childmethod extends Parentmethod {
	public void s1()
	{
		System.out.println("Child method");
		//s2();
	}
	public void s5()
	{
		System.out.println("automation");
	}
	public void s6()
	{
		System.out.println("quality");
	}
	public static void s7()
	{
		System.out.println("analyst");
	}
	public static void s8()
	{
		System.out.println("java");
	}

	public static void main(String[] args) 
	{
		//s7();
		//s8();
		//s3();
	    //s4();
		Childmethod h = new Childmethod();
		//h.s1();
		//h.s5();
		//h.s6();
		//h.s2();
		Parentmethod j= new Parentmethod();
		j.s1();
		
	

	}

}
