package tasks;

public class Arraysplitstatement 
{

	public static void main(String[] args) 
	{
		String ab= "it is an automation testing";
		//String arr[] = null;

	    // Converting using String.split() method with whitespace as a delimiter
	   String arr[] = ab.split(" ");   //formula for string split

	    // Printing the converted string array
	    for (int i = 0; i <=arr.length-1; i++)
	    {
	      System.out.println(arr[i]);
		}
	}

}
