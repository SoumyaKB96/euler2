package eu;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long  sum=0;
		for(int i=1;i<=1000;i++)
		{
		if(i%3==0 || i%5==0)
		{
		sum=sum+i;
		}
		}
		System.out.println("Sum of multiples of 3 and 5 are:"+sum);
		

	}

}
