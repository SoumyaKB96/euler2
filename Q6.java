class Q6
{
    public static void main()
    {int s1=0,s2=0,diff=0;
        for(int i=1;i<=100;i++)
        {
            s1+=(i*i);
            s2+=i;
        }
        s2=s2*s2;
        diff=s2-s1;
        System.out.println(diff);
    }
}
