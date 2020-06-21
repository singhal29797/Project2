import java.util.Scanner;
public class OddSqrt
{
	public static void main(String[] args) 
	{
	    int sum=0,k=1,h=0,t=0;
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the Numbers :");
	    int n = sc.nextInt();
	    for(int j=1;j<=n;j++)
	    {
	        
	        sum+=k;
	        k=k+2;
	        if(j==n)
	        System.out.print(sum-h);
	        else
	        System.out.print(sum-h+"+");
	        h=sum;
	        t=h;
	    }
	    System.out.println("="+sum);
        for(int i=0; i < (sum/2); i++)
        {
            int sqrt = i*i;
            if(sqrt==sum)
            {
                System.out.println("Square Root of Sum of N Terms is : "+i);
                break;
            }
        }
	    
	}
	
}
