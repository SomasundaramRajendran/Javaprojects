package somu;

public class blocks {
	{
		System.out.println("hi");    //instance block
	}
	
	static
	{
		System.out.println("hi");
	}
	public static void main(String[] args) 
	{
	                                    //if static we dont need to code anything in main method, it directly call the value in static block
		new blocks();                   // if in instance block we need to create object for instance block, then it call the instance block so we use formula new classname(); instead of whole formula classame objectname = new classname();

	}

}
