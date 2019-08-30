package eu;

public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=6,i=13;
		while(c<10001)
		{
			if(isprime(i++)==true)c++;
		}
        System.out.println(i);
	}
	public static boolean isprime(int n)
	{
		for(int i=2;i<Math.sqrt(n);i++)
		{
			if(n%i==0)return false;
		}
		return true;

	}

}
