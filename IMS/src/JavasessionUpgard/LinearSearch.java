package JavasessionUpgard;

public class LinearSearch {

    public static void search(int arr[], int num){
        int len = arr.length;
        int comparison = 0 ;

        int myIndex = -1;
        for(int i = 0 ; i < len; i++){
            comparison++;
            if(arr[i] == num ){
                myIndex = i;
                break;
            }
        }
        if(myIndex != -1){
            System.out.println("index is : " +myIndex);
        }
        else
            System.out.println("could not find element");
        System.out.println("no of comparison :  " + comparison);
    }


    public static void main(String [] args){
        int arr[] = {12,34,56,34,23,43};
        search(arr,56);

    }
}
