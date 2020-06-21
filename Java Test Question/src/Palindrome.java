import java.util.Scanner;
public class Palindrome
{
    public static void main(String[] args)
    {
        String rev="";
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int length=a.length();
        for(int i=length-1;i>=0;i--)
            rev+=a.charAt(i);
        if(a.equals(rev))
            System.out.println("palindrome");
        else
            System.out.println("Not Palindrome");
            

    }

}
