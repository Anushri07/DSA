import java.util.*;
public class insertAtPosition {
	//naive approach
	public static void insertAtIndex(int arr[],int sizeOfArray,int index,int element)
    {
        int newarr[] = new int[sizeOfArray+1];
        for(int i=0;i<sizeOfArray+1;i++){
            if(i<index){
                newarr[i] = arr[i];
            }else if(i==index){
                newarr[i] = element;
            }else{
                newarr[i] = arr[i-1];
            }
        }
        for(int i=0;i<sizeOfArray+1;i++) {
        	System.out.println(newarr[i]);
    }
    }
	public static int[] insert(int arr[],int n,int index,int element) {
		int[] result = new int[n + 1];
	    for (int i=0, j=0; i < n; i++, j++)
	    {
	        if (i == index)
	        {
	            result[j] = element;
	            j++;
	        }
	        result[j] = arr[i];
	    }
	    return result;	
	}
	//efficient approach with less complexity
	public static int insertAtpos(int arr[],int size,int index,int element) {
		int n = arr.length+1;
		for(int i=n-2;i>=index;i--){
			arr[i+1]=arr[i];
		}
		arr[index]=element;
		for(int i=0;i<n+1;i++) {
			System.out.println(arr[i]);
		}
		return n+1;
	}
	public static void insertmid(int arr[],int n,int index,int element) {
		 //n=n+1;
		 for(int i=n-2;i>=index;i--){
				arr[i+1]=arr[i];
			}
		 arr[index]=element;
	}
	public static void display(int arr[],int n) {
		for(int i=0;i<n+1;i++) {
        	System.out.println(arr[i]);
    }
	}
  public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {7,7,1,1};
int n=arr.length;
//int e[] = insert(arr,n,3,3);
 insertmid(arr,n,3,3);

display(arr,n);
//System.out.println(Arrays.toString(arr));
//System.out.println(res);
//display(arr,res);
	}

}
