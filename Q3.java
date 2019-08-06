public class Q3
{
    public static void main(String[] args)
{
    int x=0,y=2;
int n= 13195 ;
while(x<=n)
{
    while(n%y==0)
    {
        x=y;
        n/=y;
    }
y+=1;
System.out.println(y-1);

    }
}
}
