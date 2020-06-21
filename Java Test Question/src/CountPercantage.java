import java.util.Scanner;

public class CountPercantage {

    public static void main(String[] args) {
        Scanner Kb=new Scanner(System.in);
        System.out.println("How man strings u want to check?");
//Take the input of no. of test cases
        int chhar=0;
//looping until the test cases are zero

//Input the string
        System.out.println("Enter the string!");
        String s=Kb.next();
//counter to count the number of digits in a string
        int digits=0;
//looping until the string length is zero
        for(int i=0;i<s.length();i++){
//isDigit is a function of Character class it checks a particular char that whether it is a digit or not
            if(Character.isDigit(s.charAt(i))){
//counter digit will be incremented each time when a character will be a digit
                digits++;
            }
            else
                //Count the charr of the string
                chhar++;
        }
//prints the number of digits in a string
        //System.out.println(chhar+""+digits);
        int sum=chhar+digits;
        double per=(double) chhar*100/(sum);
        System.out.println( "Percantage of Alphabets vs. Digit is : " + per + "% and the Number of digits: = "  +digits);
    }

}