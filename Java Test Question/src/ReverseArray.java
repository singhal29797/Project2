public class ReverseArray { 

	// function that reverses array
	public static void reverse(int arr[]) 
	{ 
		int left = 0;
		int right = arr.length - 1 ;
		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		} 

		/*printing the reversed array*/
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " "); 
	} 

	public static void main(String[] args) 
	{ 
		int [] arr = {10, 20, 30, 40, 50}; 
		reverse(arr); 
	} 
} 
