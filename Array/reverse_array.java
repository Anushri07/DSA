
public class reverse_array {
public static void reverse(int arr[],int n) {
	int low=0,high=n-1;
	while(low<high) {
		int temp = arr[low];
		arr[low] = arr[high];
		arr[high] = temp;
		low++;
		high--;
	}
	
}
public static void display(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int arr[] = {10};
 int n=arr.length;
 display(arr);
 reverse(arr,n);
 System.out.println("Reversed Array : ");
 display(arr);
	}
}
