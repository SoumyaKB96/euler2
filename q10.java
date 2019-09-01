package eu;

public class q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long s=2;
		for(long i=3;i<2000000;i+=2)
		{
			int k=0;
			for (int j=3; j<=(int)Math.sqrt(i); j++)
		    { 
		    	if(i%j==0)
				{
					k=1;
					break;
				}
		    }
				
			if(k==0) s+=i;
		}
		System.out.println(s);
	}

}
