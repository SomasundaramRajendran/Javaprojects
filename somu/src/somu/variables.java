package somu;

public class variables 
{
	public void s1()   //1.instance variable
	{
		int a = 13;
		float b = 1.5f;
		float c = a+b;
		System.out.println(c);
		
	}
	public void s2()   //2.instance variable
	{
		double a = 200.0;
		float b = 1.5f;
		double c = a*b;
		System.out.println(c);
		
	}
	public static void s3()   //3.static variable
	{
		float a = 99.5f;
		int b = 20;
		float c = a/b;
		System.out.println(c);
	}
	public static void s4()   //4.static variable
	{
		int a = 42;
		double b = 200.0;
		double c = a-b;
		System.out.println(c);
	}
	
	public static void main(String[] args) 
	{
		variables h = new variables();
		h.s1();
		h.s2();
		
		s3();
		s4();

	}

}
