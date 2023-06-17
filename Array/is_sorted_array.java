
public class is_sorted_array {
	public static int isSorted(int arr[], int n)
    {
       /// Your code here
		if(n==1) {
			return 1;
		}
		int inc=0,dec=0;
       for(int i=0;i<n-1;i++){
        if(arr[i]<=arr[i+1]) {
        	inc++;
        }else if (arr[i]>=arr[i+1]) {
        	dec++;
        }
       }
       System.out.println(inc);
       System.out.println(dec);
       if(inc==0||dec==0) {
    	   return 1;
       }
       return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr[]=  {1,3,2,5,4};
//   int arr[]= {1,1,2,2,4,4,5};
//   int arr[] = {4,3,2,1};
   
   int n= arr.length;
   int res = isSorted(arr,n);
   System.out.println(res);
	}
}
