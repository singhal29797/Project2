import java.util.Scanner;
class BubbleSort
{
    public static void main(String []args) {
    int n, i, j, swap;
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    int array[] = new int[n];
    for (i = 0; i < n; i++)
    array[i] = in.nextInt();
    for (i = 0; i < ( n - 1 ); i++) 
    {
      for (j = 0; j < n - i - 1; j++) 
      {
        if (array[j] > array[j+1]) /* For descending order use < */
        {
          swap       = array[j];
          array[j]   = array[j+1];
          array[j+1] = swap;
        }
      }
    }
    for (i = 0; i < n; i++)//to showing the output
    System.out.print(array[i]+" ");
  }
}