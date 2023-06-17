import java.util.*;

public class array {
	public static void search(int arr[],int element) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				System.out.println("Element is found");
			}
		}
	}
	public static void display(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static  int[] insertAtEnd(int arr[],int element) {
		int newarr[] = new int[arr.length + 1];
		for(int i=0;i<arr.length;i++) {
			newarr[i]=arr[i];
		}
		newarr[newarr.length]=element;
		return newarr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 5,quit=0;
int arr[] = new int[n];
for(int i=0;i<n;i++) {
	System.out.println("Enter the element");
	arr[i] = sc.nextInt();
}
while(quit==0) {
	int ch;
	System.out.println("1.Display\n2.search\n3.insert at beg\n4.insert at position");
	System.out.println("Enter your choice");
	ch = sc.nextInt();
	switch(ch) {
	case 1:
		display(arr);
		break;
	case 2:
		System.out.println("Enter the element to be search ");
		int element = sc.nextInt();
		search(arr,element);
		break;
	case 3 :
		System.out.println("Element to be inserted");
		int ele = sc.nextInt();
		arr[0]=ele;
		break;
	case 4 :
		System.out.println("Element to be inserted");
		int elem = sc.nextInt();
		System.out.println("position:");
		int pos = sc.nextInt();
		 int newarr[] = new int[n + 1];
		for(int i=0;i<n;i++) {
			if(i<pos-1) {
				newarr[i] = arr[i];
				
			}else if (i==pos-1){
				newarr[i]=elem;
			}else {
				newarr[i]=arr[i-1];
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		break;
	case 5 :
		System.out.println("Element to be inserted");
		int eleme = sc.nextInt();
		insertAtEnd(arr,eleme);
		break;
	case 6:
		quit=1;
		break;
	}
}



System.out.println("Enter the element to be insert at beg ");
int ele = sc.nextInt();	
arr[0]=ele;
}
}
