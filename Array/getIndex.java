
public class getIndex {
	public static int getByIndex(int arr[], int n, int i)
    {
		if(i>=n){
            return -1;
        }
        // Your code here
        for(int j=0;j<n;j++){
            if(arr[i]==arr[j]){
                return arr[j];
            }
        }
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {1,2,3,4};
int n=arr.length;
int result = getByIndex(arr,n,4);
System.out.println(result);
	}

}
