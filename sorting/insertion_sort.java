package sorting;

public class insertion_sort {
	public static  void sort(int arr[], int n)
	  {
		int i,j,key;
	      for(i=1;i<n;i++) {
	    	  key=arr[i];
	    	  j=i-1;
	    	  while(j>=0&&arr[j]>key) {
	    		  arr[j+1]=arr[j];
	    		  j--;
	    	  }
	 //if key is not inserted in between then make the key to next element
	    	  arr[j+1]=key;
	      }
	  }
	public static void display(int arr[],int n) {
		 for(int i=0;i<n;i++) {
			 System.out.print(arr[i]+" ");
		 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4, 1, 3, 9, 7};
		sort(arr,arr.length);
		display(arr,arr.length);
	}

}
