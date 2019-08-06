public class Q10 {
	public static void main(String[] args)
	{
		
	int len=2000001;
	boolean b[]=new boolean[len];
	
	for(int i=2;i<=len/2;i++)
	{
	for(int j=2;j<len;j++)
	{
		if(j%i==0)b[j]=true;
	}
	}
	int s=0;
	for(int i=2;i<len;i++)
		{if(b[i]==false)s+=i;}
  System.out.println(s);
}
}