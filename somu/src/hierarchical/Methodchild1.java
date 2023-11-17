package hierarchical;

public class Methodchild1 extends Methodparent
{
	public void s1()
	{
		System.out.println("child 1 instance");
	}
	public void s3()
	{
		System.out.println("software");
		Methodparent p=new Methodparent();
		p.s1();
	}
	public static void s4()
	{
		System.out.println("child 1 static");
	}
}
