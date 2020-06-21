class BinaryConversion
{
    public static void main(String[] args)
    {
        int n=128;
        int i=0;
        int[] a = new int[10];
        while(n>0)
        {
            int rem = n%2;
            a[i++]= rem;
            n=n/2;
        }
        for(int l=i-1;l>=0;l--)
            System.out.print(a[l]);
    }
}
