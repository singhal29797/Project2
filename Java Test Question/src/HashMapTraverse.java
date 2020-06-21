import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.HashMap;

class HashMapTraverse
{
    public static void main(String[] args)
    {
        HashMap <Integer,String> hm = new HashMap<Integer,String>();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<5;i++)
        {
            Integer a=sc.nextInt();
            String s=sc.nextLine();
            hm.put(a, s);
        }

        ArrayList<Integer> keyList = Collections.list(Collections.enumeration(hm.keySet()));
        Collections.sort(keyList);

        for(Integer s : keyList)
        {
            System.out.print(s);
            System.out.println(hm.get(s));
        }
    }

    static class Pattern
    {
        public static void main(String args[])
        {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            for(int i=1; i<=n; i++)
            {
                for(int j=n; j>i; j--)
                {
                  int k=1;
                  System.out.print(k);
                }
                for(int k=1; k<=i; k++)
                {
                    System.out.print(i);
                }
                System.out.println();
            }
        }
    }
}