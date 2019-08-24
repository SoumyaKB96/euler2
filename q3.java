package eu;

public class q3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long numm = 600851475143l;
		
		long max=0;
		 
		for (long i = 2; i<numm/2; i++) {
		    if (numm%i==0)
		    {
		    	for (int j = 2; j<Math.pow(i,0.5)+1;j++)
		            if (i % j == 0)max=i;
		    }
		    		
		    		
		}
		  System.out.println(max);
	}
	
}
		     