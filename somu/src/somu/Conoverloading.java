package somu;

public class Conoverloading 
{
	public Conoverloading()
	{
		System.out.println("this is an user defined constructor");
		
	}
	public void s1(int a, double b)                //instance method
	{
		//this.s1(30.5f, 10 );                     // use "this" keyword in local variable
		double c=a+b;
		System.out.println(c);
		
		Conoverloading.s1(10, 50.5f, 200.0);
	}
	public void s1(float a, int b)                 //instance method
	{
		float c = a-b;
		System.out.println(c);
		
	}
	public static void s1(double a, float b)        //static method
	{
		double c= a/b;
		System.out.println(c);
	}
	public static void s1(int a, float b, double c)   //static method
	{ 
		double d= a*b*c;
		System.out.println(d);
		//Conoverloading.s1(300.0, 20.5f);           //static method 1 in static method 2    use class method
		//Conoverloading j = new Conoverloading();   //instance method 2 in static method 2  use object method
		//j.s1(40.5f, 30);
	}

	public static void main(String[] args) 
	{
		Conoverloading h = new Conoverloading();
		h.s1(10, 250.0);
		//h.s1(50.5f, 20);
		
		//Conoverloading.s1(230.0, 40.5f);               //method name same so we use (class method)
		//Conoverloading.s1(40, 15.5f, 230.0);

	}

}
