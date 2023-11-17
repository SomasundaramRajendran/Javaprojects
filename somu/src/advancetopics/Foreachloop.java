package advancetopics;

public class Foreachloop {
	public static void main (String[]args)
	{
		String a[]= {"role","software","test","engineer","QA"};
		for (String ab:a)        //after string we specified only double letter 
		{
			System.out.println(ab);
		}
		System.out.println("----------decreament----------");
		for(int i=a.length-1; i>=0;--i)
		{
			System.out.println(a[i]);
		}
		/*int b = a.length;
		System.out.println(b);*/
		
	}

}
