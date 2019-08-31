package eu;

public class q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 2000000;
		 long s = 0;
	    boolean[] ar = new boolean[n];
	    
	    for (int i=2; i<n;i++)ar[i] = true;
	    
	    for (int i=2; i<=(int)Math.sqrt(n); i++)
	    { 
	        if (ar[i]==true)  for (int j=2; j*i<n; j++)ar[i*j]=false;
	        
	    }
	    
	   
	    for (int i=2; i<n; i++) 
	    { 
	        if (ar[i]==true) s+=i;
	    }
	    System.out.println(s);

	}

}
