
public class count_smaller_than_x {
	public static int count(int arr[], int n, int x)
    {
        // Your code here
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]<x) {
				count++;
			}
		}
		return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		int n = arr.length;
		int result=count(arr,n,5);
		System.out.println(result);
	}

}
