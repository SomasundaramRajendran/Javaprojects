package mixed;

public class Example {
	static 
	{
		System.out.println("python");
	}
	public Example()
	{
		System.out.println("software");
	}
	public Example(int a,int b)
	{
		
		int c=a+b;
		System.out.println(c);
	}
	int a=100;
	static String b="java";
	public void s1()
	{
		System.out.println(this.a);
		System.out.println(Example.b);
	}
	public void s2()
	{
		System.out.println("software");
	}
	public static void s3()
	{
		int a=80;
		float b=60.5f;
		float c=a-b;
		System.out.println(c);
	}
	public static void s4()
	{
		double a=200.0;
		int b=10;
		float c=20.5f;
		double d=a/b/c;
		System.out.println(d);
	}
	public static void main(String[] args)
	{
		Example j = new Example();
		//new Example(10,20);
		//j.s1();
		//j.s2();
		//s3();
		//s4();
		System.out.println(j.a);
		System.out.println(Example.b);
		
	}

}
