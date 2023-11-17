package hierarchical;

public class Methodchild3 extends Methodparent
{
	public void s1()
	{
		System.out.println("child 3 instance");
	}
	public void s7()
	{
		System.out.println("manual");
	}
	public static void s8()
	{
		System.out.println("child 3 static");
		Methodchild1 i=new Methodchild1();
		i.s1();
	}
	public static void s9()
	{
		System.out.println("automation");
	}

	public static void main(String[] args)
	{
		//s9();
		//s8();
		//s2();
		Methodchild3 j = new Methodchild3();
		//j.s1();
		//j.s7();
		Methodparent k = new Methodparent();
		//k.s1();
		Methodchild2 l = new Methodchild2();
		//l.s1();
		//Methodchild2.s5();
		//Methodchild2.s6();
		Methodchild1 o = new Methodchild1();
		//o.s1();
		//o.s3();
		//Methodchild1.s4();
		
	}

}
