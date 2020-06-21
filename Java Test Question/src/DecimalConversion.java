public class DecimalConversion {
    public static void main(String[] args)
    {
        String a = "1000";
        String b = "1010";

        int c = Integer.parseInt(a,2);
        int d = Integer.parseInt(b,2);

        int e = c + d;

        System.out.println(e);
    }
}
