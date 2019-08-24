package eu;

public class q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 long sum = 0;
	        for (int i = 0; i < 2000000; i++)
	            if (isPrime(i))
	                sum += i;
	        System.out.print(sum);

	}
	public static boolean isPrime(long n) {
        if (n < 2) return false;
        else if (n == 2) return true;
        for (int i = 2; i<Math.pow(n,0.5)+1;i++)
            if (n % i == 0)
                return false;
        return true;
    }

}
