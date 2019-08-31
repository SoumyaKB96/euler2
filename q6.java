package eu;

public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int s1=0,s2=0,diff=0;
		int n=100;
		s1=(n*(n+1)*(2*n+1))/6; 
		s2=(n*(n+1))/2; 
       s2=s2*s2;
        diff=s2-s1;
        System.out.println(diff);

	}

}
