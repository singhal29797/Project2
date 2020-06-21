import java.util.Scanner;
public class CountVowel {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a=0, e=0, i=0, o=0, u=0;
        for(int j=0; j<s.length(); j++)
        {
            if(s.charAt(j)=='a' || s.charAt(j)=='A')
            {
                a++;
            }

            if(s.charAt(j)=='e' || s.charAt(j)=='E')
            {
                e++;
            }
            if(s.charAt(j)=='i' || s.charAt(j)=='I')
            {
                i++;
            }
            if(s.charAt(j)=='o' || s.charAt(j)=='O')
            {
                o++;
            }
            if(s.charAt(j)=='u' || s.charAt(j)=='U')
            {
                u++;
            }

        }
        System.out.println("A = "+a);
        System.out.println("E = "+e);
        System.out.println("I = "+i);
        System.out.println("O = "+o);
        System.out.println("U = "+u);
    }
}