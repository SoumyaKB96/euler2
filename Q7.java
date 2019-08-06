public class Q7 {

	public static void main(String[] args)
	{
		int c=6,i=13;
		while(c<10001)
		{
			if(isprime(i++)==true)c++;
		}
        System.out.println(i);
	}
	public static boolean isprime(int n)
	{
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)return false;
		}
		return true;
	}
}
