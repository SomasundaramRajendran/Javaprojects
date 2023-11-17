package oops;

public class VariableChildmulti extends VariableParentmulti
{
	int a=1000;
	static String b="bala";
	double c=200.0;
	
	public void s1()
	{
		System.out.println("------------VariableChildmulti----------");
		System.out.println(this.a);
		System.out.println(this.c);
		System.out.println(VariableChildmulti.b);
		System.out.println("------------VariableParentmulti----------");
		System.out.println(super.a);
		System.out.println(super.c);
		System.out.println(VariableParentmulti.b);
		System.out.println("------------VariableGrandparentmulti----------");
		VariableGrandparentmulti p= new VariableGrandparentmulti();
		System.out.println(p.a);
		System.out.println(VariableGrandparentmulti.b);
		
	}
	public void s6()
	{
		double a=250.0;
		float b=150.5f;
		double c=a-b;
		System.out.println(c);
	}
	public static void s7()
	{
		float a=140.5f;
		int b=50;
		float c=a+b;
		System.out.println(c);
	}
	public static void s8()
	{
		int a=50;
		double b=200.0;
		float c=75.5f;
		double d=a/b/c;
		System.out.println(d);
		
	}
	

	public static void main(String[] args)
	{
		//s8();
		//s7();
		//s5();
		//s3();
		//s2();
		VariableChildmulti r =new VariableChildmulti ();
		//r.s1();
		//r.s4();
		//r.s6();
		VariableParentmulti t =new VariableParentmulti ();
		//t.s1();
		VariableGrandparentmulti y = new VariableGrandparentmulti ();
		//y.s1();

	}

}
