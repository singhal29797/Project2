import java.io.*; 
import java.util.Scanner;
  
class SumOfDigitsUsingRecursion 
{ 
    // Function to check sum  
    // of digit using recursion 
    static int SumOfDigitsUsingRecursion(int n) 
    {  
        if (n == 0) 
            return 0; 
        return (n % 10 + SumOfDigitsUsingRecursion(n / 10)); 
    } 
  
    // Driven Program to check above 
    public static void main(String args[]) 
    { 
	Scanner sc  = new Scanner(System.in);
	System.out.println("Enter the Digit to be sum");
        int num = sc.nextInt(); 
        int result = SumOfDigitsUsingRecursion(num); 
        System.out.println("Sum of digits in " +num+ " is " + result); 
    } 
} 
  