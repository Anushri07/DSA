package recursion;

public class print_array {
	public static void printArrayRecursively(int arr[], int n)
    {
        // Print the array elements recursively
		if(n==0) {
			return;
		}
		printArrayRecursively(arr,n-1);
		System.out.println(arr[n-1]);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,4,2,1};
		int n=arr.length;
		printArrayRecursively(arr,n);
	}

}
