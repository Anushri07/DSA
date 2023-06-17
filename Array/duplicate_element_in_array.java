//Remove duplicate from sorted array
public class duplicate_element_in_array {
	//naive method 
public static int duplicate(int arr[], int n) {
	int temp[] = new int[n];
	temp[0]=arr[0];
	int res=1;
	for(int i=1;i<n;i++) {
		if(temp[res-1]!=arr[i]) {
			temp[res]=arr[i];
			res++;
		}
	}
	for(int i=0;i<n;i++) {
		arr[i]=temp[i];
	}
	return res;
}
public static void display(int arr[],int n) {
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}
}
//efficient method with less complexity
public static int dupli(int arr[],int n) {
	int res = 1;
	for(int i = 1; i < n; i++)
	{
		if(arr[res - 1] != arr[i])
		{
			arr[res] = arr[i];
			res++;
		}
	}
	
	return res;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {10,20,20,30,30,30};
int n = arr.length;
System.out.println("before removing duplicate element ");
display(arr,n);
int result = dupli(arr,n);
System.out.println("\nAfter removing duplicate element ");
display(arr,result);
System.out.println("\nSize of new array:"+result);
	}

}
