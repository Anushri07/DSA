package searching;

public class ternary_search {
	//iterative approach
public static int search(int arr[],int l,int h,int x) {

	 while(l<=h) {
		// Find mid1 and mid2 
		 int mid1= l+(h-1)/3;
		 int mid2=h-(h-1)/3;
		// Check if key is present at any mid 
		 if(arr[mid1]==x) {
			 return mid1;
		 }
		 if(arr[mid2]==x) {
			 return mid2;
		 }
		 
		  if(x<arr[mid1]) {
			 h=mid1-1;
		 }
		  else if(x>arr[mid2]) {
			 l=mid2+1;
		 }
		  else {
			  // The key lies in between mid1 and mid2 
	            l = mid1 + 1; 
	            h = mid2 - 1; 
		  }
	 }
	 return -1;
}

//recursive approach
public static int search2(int arr[],int l,int h,int x) {
	while(l<=h) {
		int mid1=l+(h-1)/3;
		int mid2=h-(h-1)/3;
		// Check if key is present at any mid 
				 if(arr[mid1]==x) {
					 return mid1;
				 }
				 if(arr[mid2]==x) {
					 return mid2;
				 }
				 if(x<arr[mid1]) {
					 return search2(arr,l,mid1-1,x);
					
				 }
				  else if(x>arr[mid2]) {
					  return search2(arr,mid2+1,h,x);
					
				 }
				  else {
					  // The key lies in between mid1 and mid2 
					  return search2(arr,mid1+1,mid2-1,x);
				  }
	}
	return -1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40,50};
		System.out.println(search2(arr,0,arr.length-1,30));
	}

}
