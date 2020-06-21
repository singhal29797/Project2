import java.util.Scanner;
class Ncr {
    public static void main(String[] args)
    {
        int n ,r;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        r = s.nextInt();
        System.out.println(nCr(n, r));
    }

    public static int nCr(int n, int r)
    {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }
    static int factorial(int n)
    {
    if(n==1)
	    return 1;
    else   
	    return n*factorial(n-1);
    }

    static class SumOfDigit
    {
        public static void main(String[] args)
        {
            int n=128;
            int sum = 0;
            while(n>0)
            {
                sum += n % 10;
                n = n/10;
            }
            System.out.print(sum);
        }
    }
}