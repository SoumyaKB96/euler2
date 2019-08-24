package eu;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int s=2;
         int a = 1, b = 2, c= a+b;
        while(c<=4000000)
        {
             if(c%2==0)s+=c;
            a = b;
            b = c;
            c = a + b;
              
        }
        System.out.println(s);

	}

}
