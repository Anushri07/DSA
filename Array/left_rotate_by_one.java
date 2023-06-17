
public class left_rotate_by_one {
public static void leftRotate(int arr[],int n) {
	int temp=arr[0];
	for(int i=1;i<n;i++) {
		arr[i-1]=arr[i];
	}
	arr[n-1]=temp;
}
public static void display(int arr[],int n) {
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {1,2,3};
int n = arr.length;
leftRotate(arr,n);
display(arr,n);
	}

}
