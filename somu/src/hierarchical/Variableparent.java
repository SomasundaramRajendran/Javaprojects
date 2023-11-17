package hierarchical;

public class Variableparent
{
	int a =10;
	static float b=50.5f;
	
	public void s1()
	{
		System.out.println(this.a);
		System.out.println(Variableparent.b);
	}
	public static void s2()
	{
		double a=210.0;
		int b=10;
		double c=a+b;
		System.out.println(c);
	}
}
