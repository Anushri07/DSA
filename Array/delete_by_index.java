
public class delete_by_index {
//public static int delete(int arr[],int n,int index) {
//	for(int i=0;i<n;i++) {
//		if(i==n) {
//			return n;
//		}
//		if(i==index) {
//			break;
//		}
//		for(int j=i;j<n-1;j++) {
//			arr[j]=arr[j+1];
//		}
//	}
//	
//	return n-1;
//}
public static int del(int arr[],int n,int idx) {
	for(int i=0;i<n;i++) {
		if(i==idx) {
			for(int j=i;j<n-1;j++) {
				arr[j]=arr[j+1];
			}
			break;
		}
		
	}
	arr[n-1]=0;
	return n-1;
}
public static void display(int arr[],int n) {
	for(int i=0;i<n;i++) {
    	System.out.println(arr[i]);
}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {1,2,3,4,5};
int n=arr.length;
int e=del(arr,n,0);
//System.out.println(e);
display(arr,n);
	}
}
