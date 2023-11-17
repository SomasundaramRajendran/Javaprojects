package interface1;

public class Child implements Webdriver
{

	public static void main(String[] args)
	{
		Webdriver j = new Child();
		j.Name();
		j.Date_of_brith();
		j.Address();
		j.Education();
		j.Ambition();

	}

	@Override
	public void Name() {
		System.out.println("SOMU");
		
	}

	@Override
	public void Date_of_brith() {
		System.out.println("25-12-1998");
		
	}

	@Override
	public void Address() {
		System.out.println("KANCHIPURAM");
		
	}

	@Override
	public void Education() {
		System.out.println("BE-PRODUCTION ENGINEERING");
		
	}

	@Override
	public void Ambition() {
		System.out.println("Software tester");
		
	}

}
