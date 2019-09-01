package eu;

public class q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long s=2;
		for(long i=3;i<2000000;i+=2)
		{
				
			if(isprime(i)==true) s+=i;
		}
		System.out.println(s);
	}
	public static boolean isprime(long n)
	{
		if (n<=1) return false; 
        if (n<=3) return true; 
        if (n%2==0 || n%3==0) return false; 
      
        for (int i= 5; i*i<=n; i=i+6) 
            if (n%i==0 || n%(i+2)==0) 
            return false; 
      
        return true; 
	}

}
