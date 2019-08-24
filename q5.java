package eu;

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long hcf=1;
		  long i=1;
		while(i<=20)
		{
			hcf=lcm(i);
			i++;
			
		}
		System.out.println(hcf);
	}
	static long gcd(long a, long b) 
	{ 
	   if(a%b!=0)  
	      return gcd(b,a%b); 
	   else 
	      return b; 
	} 
	static long lcm(long n) 
	{ 
	    long l=1;     
	    for (long i=1; i<=n; i++) 
	        l=(l*i)/(gcd(l,i)); 
	    return l; 
	} 
}
