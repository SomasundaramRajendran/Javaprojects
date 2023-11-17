package oops;

public class VariableParentmulti extends VariableGrandparentmulti
{ 
	int a=1000;
	static String b="somu";
	float c =2.5f;
	public void s1()
	{ 
		System.out.println("-----------VariableParentmulti------------");
		System.out.println(this.a);
		System.out.println(this.c);
		System.out.println(VariableParentmulti.b);
		System.out.println("-----------VariableGrandparentmulti------------");
		System.out.println(super.a);
		System.out.println(VariableGrandparentmulti.b);
	}
	public void s4()
	{
		double a =200.0;
		int b=5;
		double c=a/b;
		System.out.println(c);
	}
	public static void s5()
	{
		float a =110.5f;
		int b=5;
		double c=205.0;
		double d=a*b*c;
		System.out.println(d);
	}
}

