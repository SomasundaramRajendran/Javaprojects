package hierarchical;

public class Methodparent 
{
	public void s1()
	{
		System.out.println("parent 1 instance");
	}
	public static void s2()
	{
		System.out.println("parent 1 static");
		Methodchild2.s5();
	}
}
