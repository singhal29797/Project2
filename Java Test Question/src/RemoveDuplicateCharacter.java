public class RemoveDuplicateCharacter {

    public static void main(String[] args) {

        String str = "aaaaaaadddddaaabbbbbfbbbbbccccaaaacdccdddddeddeeeee";
        String str1="";

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch!=' ')
            {
                str1 += ch;
                str=str.replace(ch,' ');
            }
        }
        System.out.println(str1);
    }
}