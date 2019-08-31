package eu;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        long n = 600851475143l;
        long f = n;
        long i = 2;
        
        while (i<=n && n!=1) 
        {
            if (n%i==0) 
            {
                n=n/i;
                f=i;
               

            }
            else  i++;
            
        }
        System.out.println(f);

	}

}
