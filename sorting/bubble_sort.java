package sorting;

public class bubble_sort {
	//naive solution
 public static void sort(int arr[],int n) {
	 for(int i=0;i<n-1;i++) {
		 for(int j=0;j<n-i-1;j++) {
		 if(arr[i]>arr[i+1]) {
			 int temp=arr[i];
			 arr[i]=arr[i+1];
			 arr[i+1]=temp;
		 }
		 } 
	 }
 }
 //optimized solution
 public static void sort2(int arr[],int n) {
	 for(int i=0;i<n-1;i++) {
		 boolean swapped=false;
		 for(int j=0;j<n-i-1;j++) {
			 if(arr[j]>arr[j+1]) {
				 int temp=arr[j];
				 arr[j]=arr[j+1];
				 arr[j+1]=temp;
				 swapped=true;
			 }
		 }
		 if(swapped==false) {
			 break;
		 }
	 }
 }
 public static void display(int arr[],int n) {
	 for(int i=0;i<n;i++) {
		 System.out.print(arr[i]+" ");
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {4, 1, 3, 9, 7};
sort2(arr,arr.length);
display(arr,arr.length);
	}

}
