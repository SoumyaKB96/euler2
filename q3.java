package eu;

public class q3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long numm = 600851475143l;
		
		long max=0;
		
		for (long i = 2; i<numm/2; i++) {
		    if (numm%i==0 && isPrime(i))
		    	max=i;
		    
		    		}
		
		
		 System.out.println(max);
		
	}
	static boolean isPrime(long n)
	{
		for(long i=2;i<n/2;i++)
			{if(n%i==0)return false;}
			return true;
	}
	
}
		     