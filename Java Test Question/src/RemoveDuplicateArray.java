import java.util.*;
public class RemoveDuplicateArray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++)
            arr1[i] = sc.nextInt();
        Arrays.sort(arr1);
        int count = 0;
        int[] arr2 = new int[n];
        for (int i = 0; i < n - 1; i++) {
            if (arr1[i] != arr1[i + 1]) {
                arr2[count++] = arr1[i];
            }
        }
        for (int i = 0; i < count; i++)
            System.out.println(arr2[i] + " ");

        for (int i = n - 1; i > 0; i--) {
            System.out.println(arr1[i]);
            break;
        }

    }
}


