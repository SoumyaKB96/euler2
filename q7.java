package eu;

public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=6,i=13;
		while(c<=10001)
		{
			if(isprime(i++)==true)c++;
		}
		i--;
        System.out.println(i);
	}
	public static boolean isprime(int n)
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
