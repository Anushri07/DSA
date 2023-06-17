
public class sorted_array {
//public static int sortingArray(int arr[]) {
//	int n = arr.length;
//	for(int i=0;i<n;i++) {
	
//		if(arr[n-1]<arr[n-2]) {
//			return -1;
//		}
//		return sortingArray(arr);
//	}
//	return 1;
//}
public static int sortedarray(int arr[],int n) {
	if(n==1||n==0) {
		return 1;
	}
	if(arr[n-1]<arr[n-2]) {
		return 0;
	}
	return sortedarray(arr,n-1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,50,60};
		int n=arr.length;
		int result = sortedarray(arr,n);
		if(result==0) {
			System.out.println("Array is not sorted");
		}else {
			System.out.println("Array is sorted");
		}
		
	}

}
