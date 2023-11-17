package hierarchical;

public class Variablechild1 extends Variableparent
{
	double a=100.0;
	static String b="software";
	
	public void s1()
	{
		
		System.out.println("----global child1----");
		System.out.println(this.a);
		System.out.println(Variablechild1.b);
		System.out.println("----global parent----");
		System.out.println(super.a);
		System.out.println(Variableparent.b);
	}
	public static void s3()
	{
		int a=50;
		float  b=70.5f;
		float c=a-b;
		System.out.println(c);
	}
	public static void s4()
	{
		float a=75.5f;
		int b=2;
		float c=a*b;
		System.out.println(c);
	}
}
