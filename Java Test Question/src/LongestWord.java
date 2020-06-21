public class LongestWord
{
    public static void main(String[] args)
    {
        String str = "india is a veryyyyyyy beautiful country";
        //String str1 = "";

        str = str.replaceAll("a","");

        /*for(String a : word)
        {
            if(a.length()>= str1.length())
            {
                str1=a;
            }
        }*/
        System.out.println(str);
    }
}


