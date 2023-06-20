package sorting;

public class quickSort_using_lomuto {
public static int partition(int arr[],int l,int h) {
	int i=l-1;
	int p=h;
	for(int j=l;j<h;j++) {
		if(arr[j]<arr[p]) {
			i++;
			//swapping if element is lower than the pivot
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
	//pivot will get swapped to its correct index
	int temp=arr[i+1];
	arr[i+1]=arr[p];
	arr[p]=temp;
	return i+1;
}
public static void quickSort(int arr[],int l,int h) {
	if(l<h) {
		int p=partition(arr,l,h);
		quickSort(arr,l,p-1);
		quickSort(arr,p+1,h);
	}
}
public static void display(int arr[],int n) {
	 for(int i=0;i<n;i++) {
		 System.out.print(arr[i]+" ");
	 }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,5,8,9,3,4,7};
		quickSort(arr,0,arr.length-1);
		display(arr,arr.length);
	}

}
