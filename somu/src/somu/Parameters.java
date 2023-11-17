package somu;

public class Parameters
{
	public float s1(int a, float b)
	{
		float c=a/b;
		System.out.println("Value is =" +c);
		return c;
		
	}
	public double s1(double a, int b)
	{
		double c=a*b;
		System.out.println("Value is ="  +c);
		return c;
		
	}
	public static double s1(float a, double b, int c)
	{
		double d=a-b-c;
		System.out.println("Value is =" +d);
		return d;
		
	}
	public static String s1(String a)
	{
		System.out.println("Name of the student is =" +a);
		return a;
		
	}
	public static void main(String[] args) 
	{
		Parameters h =new Parameters();
		float a=  h.s1(80, 40.5f);
		System.out.println(a);
		
		double b= h.s1(250.0, 50);
		System.out.println(b);
		
		double c = Parameters.s1(85.5f, 250.0, 10);
		System.out.println(c);
		
		String d= Parameters.s1("somu");
		System.out.println(d);
		
	}

}
