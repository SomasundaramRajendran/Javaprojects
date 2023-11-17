package tasks;

public class Reversenamestring {

	public static void main(String[] args)
	{
		/*StringBuffer a = new StringBuffer("somu");  //stringbuffer is used to reverse a string value
		System.out.println(a.reverse());*/
          String a= "somu";
          char b[]=a.toCharArray();
          for(int i=b.length-1;i>=0;i--)
          {
        	  System.out.print(b[i]);
          }
	}

}
