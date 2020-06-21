import java.util.Scanner;
public class CountString
{
    public static void main(String[] args)
    {
        int c=0;
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        for(int i=0;i<a.length();i++)
        {
            char ch =a.charAt(i);
            if(ch =='a' || ch == 'A' ||ch =='e' || ch == 'E' || ch =='i' || ch == 'I' || ch =='o' || ch == 'O' ||ch =='u' || ch == 'U')
	    c++;
        }
	System.out.println(c);

    }
}
