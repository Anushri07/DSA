package sorting;
//Naive partition
public class partition_of_array {
	//naive approach
public static void partition(int arr[],int l,int h,int p) {
	int temp[]= new int[(h-l)+1];
	int index=0;
	for(int i=l;i<=h;i++) {
		if(arr[i]<arr[p]&& i!= p) {
			temp[index]=arr[i];
			index++;
		}
	}
	temp[index++] = arr[p];
	for(int i=l;i<=h;i++) {
		if(arr[i]>arr[p]) {
			temp[index]=arr[i];
			index++;
		}
	}
	for(int i=l;i<=h;i++) {
		arr[i]=temp[i-l];
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
partition(arr,0,arr.length-1,6);
display(arr,arr.length);
	}

}
