package hierarchical;

public class Methodchild2 extends Methodparent 
{
	public void s1()
	{
	   System.out.println("child 2 instance");	
	}
	public static void s5()
	{
		System.out.println("testing");
	}
	public static void s6()
	{
		System.out.println("child 2 static");
		Methodchild3.s9();
	}
}
