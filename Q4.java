class Q4
{
    public void main()
    {int max=10*10;int p=1;
        for(int i=100;i<=999;i++)
        {
        
            for(int j=100;j<=999;j++)
            {p=i*j;}
            
            
            if(pal(p)&&p>max)max=p; 
            
    }
    System.out.println(max);
}
    public boolean pal(int n)
    {int p=0;
        for(int i=n;i>0;i/=10)
        {p=(p*10)+i%10;}
        
        if(p==n)return true;
        else return false;
    }
}