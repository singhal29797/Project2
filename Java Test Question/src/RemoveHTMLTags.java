public class RemoveHTMLTags {

    public static void main(String[] args) {


        String[] strHTMLTexts = { "<div> This is a division </div>" };
                /*
                < - start bracket
                [^>] - followed by any character which is not closing bracket ">"
                * - zero or more times
                > - followed by closing bracket
                */
        String strRegEx = "<[^>]*>";

        for(String str : strHTMLTexts){
            System.out.println( str.replaceAll(strRegEx, "") );
        }


    }
}