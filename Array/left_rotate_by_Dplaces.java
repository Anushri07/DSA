
public class left_rotate_by_Dplaces {
public static void rotate(int arr[],int n,int d) {
	int temp[]=new int[d];
	for(int i=0;i<d;i++){
		temp[i]=arr[i];
	}
	for(int i=d;i<n;i++) {
		arr[i-d]=arr[i];
	}
	for(int i=0;i<d;i++) {
		arr[n-d+i]=temp[i];
	}
	
}
//efficient method to rotate d place array
public static void rotat(int arr[],int n,int d) {
	reverse(arr,0,d-1);
	reverse(arr,d,n-1);
	reverse(arr,0,n-1);
}
public static void reverse(int arr[],int low,int high) {
	while(low<high) {
		int temp=arr[low];
		arr[low]=arr[high];
		arr[high]=temp;
		low++;
		high--;
	}
}
public static void display(int arr[],int n) {
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {1,2,3,4,5};
int n=arr.length;
rotat(arr,n,2);
display(arr,n);
}
}
