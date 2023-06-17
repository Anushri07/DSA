
public class insertAtIndex {
//	public static int insertAtpos(int arr[],int size,int index,int element,int cap) {
//		int n = arr.length+1;
//		if(n==cap){
//			return n;
//		}
//		for(int i=n-1;i>=index;i--){
//			arr[i+1]=arr[i];
//		}
//		arr[index]=element;
//		return n+1;
//	}
	public static void insertAtIndex(int arr[],int sizeOfArray,int index,int element)
    {

		for(int i=index;i<sizeOfArray+1;i++) {
			arr[i]=arr[i+1];
		}
		arr[index]=element;
}
//	public static void display(int arr[],int n) {
//		for(int i=0;i<n;i++) {
//        	System.out.println(arr[i]);
//    }
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		int sizeOfArray = arr.length;
		insertAtIndex(arr,sizeOfArray,2,90);
		//display(arr,sizeOfArray);
	}

}
