class Q9
{
public static void main()

{
int a,b,c=0;
int m=2;
int limit=1000;

while (c<limit)
{
 m=2;

for(int n=1;n<m;++n)
	{
a=m*m-n*n;
b=2*n*m;
c=m*m+n*n;

if(c>limit)break;

System.out.println(a+" "+b+" "+c);
System.out.println("Product= "+a*b*c);
}
m++;
}
}
}