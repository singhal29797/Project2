import java.util.Scanner;
public class CountWords
{
    public static void main(String[] args)
    {
        int c=0;
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        for(int i=0;i<a.length();i++)
        {
            char ch =a.charAt(i);
            if(ch ==' ' || ch == '\n' || ch == '\t')
                c++;
        }
        //System.out.println(a.split(" ").length);
        System.out.println(c+1);

        //int j= a.length();

        //System.out.println(j-c);

    }


}
