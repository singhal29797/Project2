package JavasessionUpgard;

public class DataTypes {
    public static void main(String[] args){
        int target = 56;
        int arr [] = {12,33,44,66,23};
        boolean b;

        for(int i =0 ; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    b = true;
                    System.out.println(b);
                    break;
                }
            }
        }
    }
}
