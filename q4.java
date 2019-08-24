package eu;

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=100;int p=1;
        for(int i=999;i>=100;i--)
        {
        	for(int j=999;j>=100;j--)
            {p=i*j;
           if(pal(p)==true&& p>max)
            {max=p;} 
            }
            
    }
    System.out.println(max);
}
    public static boolean pal(int n)
    {int p=0;
        for(int i=n;i>0;i/=10)
        {p=(p*10)+(i%10);}
        
        if(p==n)return true;
        else return false;

	}

}
