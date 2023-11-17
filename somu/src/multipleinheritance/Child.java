package multipleinheritance;

public class Child implements Parent,Parent1
{

	public static void main(String[] args) 
	{
		Child j = new Child();
		j.s1();
		j.s2();
		j.s3();
		j.s4();
		j.s5();


	}

	@Override
	public void s3() {
		float a=60.5f;
		double b=400.0;
		double c=a+b;
		System.out.println(c);
		
	}

	@Override
	public void s4() {
		int a=10;
		float b=50.5f;
		float c=a+b;
		System.out.println(c);
		
	}

	@Override
	public void s5() {
		double a=200.0;
		int b=20;
		double c=a-b;
		System.out.println(c);
		
	}

	@Override
	public void s1() {
		float a=75.5f;
		int b=40;
		float c=a*b;
		System.out.println(c);
		
	}

	@Override
	public void s2() {
	    double a=300.0;
	    float b=20.5f;
	    double c=a/b;
	    System.out.println(c);
		
	}

}
