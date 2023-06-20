package searching;

public class binary_search {
	//iterative approach
public static int search(int arr[],int n,int x) {
	int low=0,high=n-1;
	
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==x) {
				return 1;
			}
			if(arr[mid]>x) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
	
	return -1;
}
//recursive approach
public static int searchRecursive(int arr[],int low,int high,int x) {
	while(low<=high) {
		int mid=(low+high)/2;
		if(arr[mid]==x) {
			return 1;
		}else if(arr[mid]>x) {
			return searchRecursive(arr,low,mid-1,x);
		}else {
			return searchRecursive(arr,mid+1,high,x);
		}
	}
	return -1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {10,20,30,40,50};
System.out.println(search(arr,arr.length,40));
System.out.println(searchRecursive(arr,0,4,40));
	}

}
