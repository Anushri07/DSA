
public class largest_element_in_array {
public static int largest(int arr[],int n) {
	int res=0;
	
	for(int i=0;i<n;i++) {
		if(arr[i]>arr[res]) {
			res=i;
		}
		}
	System.out.println("Largest element is : "+arr[res]);
	return res;
}
public static int secondLargest(int arr[],int n) {
	int largest = largest(arr,n);
	int res = -1;
	for(int i=0;i<n;i++) {
		if(arr[i]!=arr[largest]) {
			if(res==-1) {
				res=i;
			}else if(arr[i]>arr[res]){
				res=i;
			}
		}
	}
	System.out.println("Second Largest element is : "+arr[res]);
	return res;
}

//second largest element in one traversal
public static int seclargest(int arr[],int n) {
	int res=-1,largest=0;
	for(int i=0;i<n;i++) {
		if(arr[i]>arr[largest]) {
			res=largest;
			largest=i;
		}
		else if(arr[i]!=arr[largest]) {
			if(res==-1||arr[i]>arr[res]) {
				res=i;
			}
		}
	}
	return res;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {5,20,12,20,8};
int n=arr.length;
System.out.println("Largest Index : "+largest(arr,n));
System.out.println("Second largest index :"+secondLargest(arr,n));
System.out.println("Second largest index :"+seclargest(arr,n));
	}

}
