package sorting;

public class selection_sort {
public static void sort(int arr[],int n) {
	for(int i=0;i<n-1;i++) {
		int min=i;
		for(int j=i+1;j<n;j++) {
			if(arr[j]<arr[min]) {
				min=j;	
			}
		}
		//swap the minimum element with the first element
		int temp=arr[min];
		arr[min]=arr[i];
		arr[i]=temp;
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
		sort(arr,arr.length);
		display(arr,arr.length);
	}

}
