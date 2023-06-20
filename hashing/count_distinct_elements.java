import java.util.*;
public class count_distinct_elements {
	//efficient solution
public static int count(int arr[],int n) {
	HashSet<Integer> h = new HashSet<>();
	for(int i=0;i<n;i++) {
		h.add(arr[i]);
	}
	return h.size();
}
//naive solution
public static int count2(int arr[],int n) {
	boolean flag = true;
	int res=0;
	for(int i=0;i<n;i++) {
		for(int j=0;j<i;j++) {
			if(arr[i]==arr[j]) {
				flag=false;
				break;
			}
		}
		if(flag==true) {
			res++;
		}
	}
	return res;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {1,2,3,3,3};
int n=arr.length;
System.out.println(count2(arr,n));
	}

}
