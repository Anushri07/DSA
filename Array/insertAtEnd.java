
public class insertAtEnd {
	public static  void insertAtEnd(int arr[],int sizeOfArray,int element)
    {
		for(int i=0;i<sizeOfArray+1;i++){
			arr[sizeOfArray-1]=element;
        }
        
    }
	public static void display(int arr[],int n) {
		for(int i=0;i<n;i++) {
        	System.out.println(arr[i]);
    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {1,2,3,4,5};
int sizeOfArray = arr.length;
insertAtEnd(arr,sizeOfArray,90);
display(arr,sizeOfArray);
	}
}
