public class Q5 {
	public static void main(String[] args)
	{ int hcf=2;
	  int i=3;
	while(i<=10)
	{
		hcf=gcd(hcf,i++);
		
	}
	System.out.println(hcf);
}
	public static int gcd(int a,int b)
	{
		int gcd=0,lcm=0;
		for(int i = 1; i <= a && i <= b; ++i)
        {
            
            if(a % i == 0 && b % i == 0)
                gcd = i;
        }
        lcm = (a*b) / gcd;
        return(lcm);
	}
}