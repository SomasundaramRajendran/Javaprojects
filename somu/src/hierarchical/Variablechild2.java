package hierarchical;

public class Variablechild2 extends Variableparent
{
	int a=1000;
	double b=300.0;
	static String c="testing";
	
	public void s1()
	{
		
		System.out.println("----global child2----");
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(Variablechild2.c);
		System.out.println("----global parent----");
		System.out.println(super.a);
		System.out.println(Variableparent.b);
		System.out.println("----global child1----");
		Variablechild1 j =new Variablechild1();
		System.out.println(j.a);
		System.out.println(Variablechild1.b);
	}
	public void s5()
	{
		double a=250.0;
		int b=50;
		double c= a-b;
		System.out.println(c);
	}
	public static void s6()
	{
		double a=300.0;
		float b=50.5f;
		int c=2;
		double d=a/b/c;
		System.out.println(d);
	}
}
