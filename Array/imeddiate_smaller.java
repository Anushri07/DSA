
public class imeddiate_smaller {
	public static int immediateSmaller(int arr[], int n, int x)
    {
		int small=0;
        // Your code here
		for(int i=0;i<n;i++) {
			if(arr[i]<x&&arr[i]>small) {
				small=arr[i];
			}		
		}
		if(small==0) {
			return -1;	
		}
		return small;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		int n = arr.length;
		int result = immediateSmaller( arr, n,6);
		System.out.println(result);
	}

}
