package abstruct;

public class Child extends Parent
{

	public static void main(String[] args) 
	{
		s2();
		Parent j =new Child();
		j.s1();
		j.get();
		j.maximize();
	    j.waitingstatement();
		j.close();

	}

	@Override
	public void get() {
		
		System.out.println("http://www.amazon.com");
	}

	@Override
	public void maximize() {

		System.out.println("Driver.manage().window().maximize();");
	}

	@Override
	public void close() {
		
		System.out.println("window");
	}



	@Override
	public void waitingstatement() {
		System.out.println("Implicitlywait");
		
	}

}
