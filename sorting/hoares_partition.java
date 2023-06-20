package sorting;

public class hoares_partition {
public static int hoares(int arr[],int l,int h) {
	int pivot=arr[0];
	int i=l-1;
	int j=h+1;
	while(true) {
		do {
			i++;
		}while(arr[i]<pivot);
		do {
			j--;
		}while(arr[j]>pivot);
		if(i>=j) {
			return j;
		}
		//swap
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
public static void display(int arr[],int n) {
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int arr[]= {5,3,8,4,2,7,1,10};
  System.out.println(hoares(arr,0,arr.length-1));
  display(arr,arr.length);
	}

}
