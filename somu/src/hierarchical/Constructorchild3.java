package hierarchical;

public class Constructorchild3 extends Constructorparent
{
	public Constructorchild3() 
	{
		System.out.println("Constructorchild3");
	}
	public static void main(String[] args) 
	{
		new Constructorchild3();
		new Constructorchild2();
		new Constructorchild1();
	}

}
