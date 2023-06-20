package sorting;

public class merege_function_of_mergeSort {
public static void sort(int arr[],int l,int m,int r) {
	int n1=m-l+1;
	int n2=r-m;
	int a[] = new int[n1];
	int b[] = new int[n2];
	//create a left sorted array
	for(int i=0;i<n1;i++) {
		a[i]=arr[l+i];
	}
	//create a right sorted array
	for(int i=0;i<n2;i++) {
		b[i]=arr[m+i+1];
	}
	//Implement merge sort
	int i=0,j=0;
	while(i<n1&&j<n2) {
		if(a[i]<=b[j]) {
			System.out.print(a[i]+" ");
			i++;
		}else {
			System.out.print(b[j]+" ");
			j++;
		}
	}
	while(i<n1) {
		System.out.print(a[i]+" ");
		i++;
	}
	while(j<n2) {
		System.out.print(b[j]+" ");
		j++;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,40,20,30};
//		int l=0;
//		int r=arr.length-1;
//		int m=(l+r)/2;
		sort(arr,0,2,4);
	}

}
