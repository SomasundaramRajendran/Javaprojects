package tasks;

public class Vowelcount {

	public static void main(String[] args) {
		String ab ="it is an automation testing";
		char[] c = ab.toCharArray();
		int count =0;
		for( int i=0; i<=c.length-1;i++)		
		{
			if( ab.charAt(i) == 'a' || ab.charAt(i) == 'e' ||ab.charAt(i)== 'i' ||ab.charAt(i) == 'o' ||ab.charAt(i)== 'u') 
			{
				
				System.out.println(ab.charAt(i));
				count++;
			}
			
		}
		System.out.println("vowel count is = " + count);
	
		
			

	}

}
