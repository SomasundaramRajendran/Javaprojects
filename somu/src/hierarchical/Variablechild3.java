package hierarchical;

public class Variablechild3 extends Variableparent
{
	
	int a= 20;
	static String b="manual";
	
	
	public void s1()
	{
		
		System.out.println("----global child3----");
		System.out.println(this.a);
		System.out.println(Variablechild3.b);
		System.out.println("----global parent----");
		System.out.println(super.a);
		System.out.println(Variableparent.b);
		System.out.println("----global child1----");
		Variablechild1 j =new Variablechild1();
		System.out.println(j.a);
		System.out.println(Variablechild1.b);
		System.out.println("----global child2----");
		Variablechild2 k =new Variablechild2();
		System.out.println(k.a);
		System.out.println(k.b);
		System.out.println(Variablechild2.c);
		
	}
	public static void s7()
	{
		double a=500.0;
		float b=80.5f;
		double c=a+b;
		System.out.println(c);
	}
	

	public static void main(String[] args)
	{
		//s7();
		//s2();
		Variablechild3 l = new Variablechild3();
		//l.s1();
		Variableparent p = new Variableparent();
		//p.s1();
		Variablechild2 o = new Variablechild2();
		//o.s1();
		//o.s5();
		//Variablechild2.s6();
		Variablechild1 i = new Variablechild1();
		//i.s1();
		//Variablechild1.s3();
		//Variablechild1.s4();
		
	

	}

}
