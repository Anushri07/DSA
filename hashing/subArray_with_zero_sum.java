import java.util.*;
public class subArray_with_zero_sum {
//naive solution
public static boolean sum(int arr[],int n) {
	
	for(int i=0;i<n;i++) {
		int sum=0;
		for(int j=i;j<n;j++) {
			sum=sum+arr[j];
			if(sum==0) {
				return true;
			}
		}
	}
	return false;
}
//efficient solution
public static boolean sum2(int arr[],int n) {
	HashSet<Integer> h = new HashSet<>();
	
	int pref_sum=0;
	for(int i=0;i<n;i++) {
		pref_sum+=arr[i];
		if(h.contains(pref_sum)) {
			return true;
		}
		if(pref_sum==0) {
			return true;
		}
		h.add(pref_sum);
	}
	return false;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {4,-3,2,1};
int n=arr.length;
System.out.println(sum2(arr,n));
	}

}
