package tasks;

public class Arrayaverage {

	public static void main(String[] args) {
		int b;
	    b=0;
		int a[]= new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		for(int i=0;i<=a.length-1;i++)
		{
			int sum = a[i]+b;
			b=sum;
			
		}
		int avg = b/a.length;
		System.out.println(avg);
		
	}

}
