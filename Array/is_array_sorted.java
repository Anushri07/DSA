
public class is_array_sorted {
	public static int isSorted(int arr[], int n)
    {
       /// Your code here
       for(int i=0;i<n;i++){
           if(arr[i]<=arr[i+1]) {
        	   return 1;
           }else if(arr[i]>=arr[i+1]) {
        	   return 1;
           }
       }
       return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[] = {1, 1, 2, 2, 3};S
		//int arr[]= {4,3,2,1};
		int arr[] = {1,5,2,9,3};
		int n = arr.length;
		int res = isSorted(arr,n);
		System.out.println(res);
	}

}
