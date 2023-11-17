package somu;

public class Global {
	
	int a = 100;
	int b = 200;  // instance variable
	static float c= 5.5f;
	static double d= 400.0;  // static variable use "static" keyword
	
	public void s1()   //1. instance variable
	{
		int a = 15;
		float b= 55.5f;
		float c = a+b;
		System.out.println(c); 
		
		System.out.println(this.a);   //global instance variable direct call for local variable use "this" key word
		System.out.println(this.b);
		System.out.println(Global.c);
		System.out.println(Global.d);  // global static variable call - use "class name" 
	
	}
	public void s2()   //2.instance variable
	{
		double a= 200.0;
		float b= 40.5f;
		double c= a/b;
		System.out.println(c);
		
		Global j = new Global();     // global instance variable call - use object method(expect local variable)
		
		System.out.println(j.a);
		System.out.println(j.b);
		System.out.println(Global.c);    // global static variable call - use "class name"
		System.out.println(Global.d);
	}
	public static void s3()  //3.static variable
	{
		int a= 25;
		double b= 250.0;
		double c= a*b;
		System.out.println(c);
		
		Global k = new Global();    // global instance variable call - use object method
		System.out.println(k.a);
		System.out.println(k.b);
		System.out.println(Global.c);
		System.out.println(Global.d);  //global static variable call - use class method
	}
	public static void s4()   //4.static variable
	{
		float a = 60.5f;
		double b= 240.0;
		int c=10;
		double d= a/b/c;
	
		System.out.println(d);
		
	}
	public static void main(String[] args)
	{
	Global h = new Global();
	//h.s1();
	//h.s2();
	
	//s3();
	//s4();
	//System.out.println(h.a);
	//System.out.println(h.b);
	//System.out.println(Global.c);
	//System.out.println(Global.d);
	}

}
