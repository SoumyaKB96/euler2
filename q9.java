package eu;

public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0,c=0;
		int s=1000;
		boolean f = false;
		for (a=1; a<s/3; a++)
		{
		    for (b=a; b<s/2; b++)
		    {
		        c = s - a - b;
		 
		        if (a*a + b*b == c*c) {
		            f= true;
		            break;
		        }
		    }
		 
		    if (f) break;
		   
		    
		}
		 System.out.println("a,b,c ="+a+" "+b+" "+c);
		 System.out.println("product ="+(a*b*c));

	}

}
