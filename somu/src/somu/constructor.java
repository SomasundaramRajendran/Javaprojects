package somu;

public class constructor
{
	{
		System.out.println("This is an default contructor string");
	}
	public constructor()
	{
		this(10, 200.0, 50.5f);
		System.out.println("This is an user defined contructor string");
	}
	public constructor(int a, int b)
	{
		int c = a+b;
		System.out.println(c);
	}
	public constructor(float a, double b)
	{
		//this();
	    double c= a*b;
	    System.out.println(c);
	}
	public constructor(double a, int b)
	{
		this("somu");             // print input value of string "somu" (constructor 5(string a)) = so we input in this constructor.
		double c= a/b;
		System.out.println(c);
	}
	public constructor(String a)
	{
		System.out.println(a);
	}
	public constructor(int a, double b, float c)
	{
		//this(10,20);
		double d= a-b-c;
		System.out.println(d);
	}

	public static void main(String[] args)
	{
		//new constructor();                   // first print default constructor value then print user defined constructor value.   
		//new constructor(10,50);          
		//new constructor(50.5f,240.0);
		//new constructor(210.0, 10);          // first print default constructor value then print any this value and then print user defined constructor value.
		//new constructor("somu");
		//new constructor(1500,200.0,50.5f);
	}

}
