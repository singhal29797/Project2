import java.util.Scanner;
public class ReverseString
{
    public static void main(String[] args)
    {
        String rev="";
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        for(int i=a.length()-1;i>=0;i--)
            rev+=a.charAt(i);
            System.out.println(rev);

    }
}
