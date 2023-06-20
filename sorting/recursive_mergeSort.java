package sorting;

public class recursive_mergeSort {
	public static void merge(int arr[],int l,int m,int r) {
		int n1=m-l+1;
		int n2=r-m;
		int a[]= new int[n1];
		int b[]= new int[n2];
		//left sorted array
		for(int i=0;i<n1;i++) {
			a[i]=arr[l+i];
		}
		//right sorted array
		for(int j=0;j<n2;j++) {
			b[j]=arr[m+j+1];
		}
		int i=0,j=0;
		int k=l;     //initial index of merged sub array
		while(i<n1 && j<n2) {
			if(a[i]<=b[j]) {
				arr[k]=a[i];
				i++;
			}else {
				arr[k]=b[j];
				j++;
			}
			k++;
		}
		//Copy remaining elements of a[] if any
		while(i<n1) {
			arr[k]=a[i];
			i++;
			k++;
		}
		//Copy remaining elements of b[] if any
		while(j<n2) {
			arr[k]=b[j];
			j++;
			k++;
		}
	}
	//merge sort by recursive approach
public static void mergeSort(int arr[],int l,int r) {
	if(l<r) {
		 // Find the middle point
		int m =l+ (r-l)/2;
		 // Sort first and second halves
		mergeSort(arr,l,m);
		mergeSort(arr,m+1,r);
		// Merge the sorted halves
		merge(arr,l,m,r);
	}
}
public static void display(int arr[],int n) {
	 for(int i=0;i<n;i++) {
		 System.out.print(arr[i]+" ");
	 }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,40,20,30};
		mergeSort(arr,0,arr.length-1);
		display(arr,arr.length);
	}

}
