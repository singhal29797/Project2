package Session4;

public class BubbleSort {
    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i = 0 ; i<n-1 ; i++){
            for(int j = 0; j<n-i-1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void print(int arr[]){
        int n =arr.length;
        for(int i = 0 ; i<n;i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {12,23,43,54,1,12,53};
        print(arr);
        bubbleSort(arr);
        print(arr);
    }
    public static void selectionSort(int arr[]){
        for(int i = 0; i< arr.length ; i++){
            int min = i ;
            for(int j = i+1 ; j<arr.length;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    public static void insertionSort(int arr[]){
        for(int i = 1 ; i < arr.length ; i++){
            int temp = arr[i];
            int j = i ;
            while( j > 0 && arr[j-1] > temp){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }

    }
}
