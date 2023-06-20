import java.util.*;
public class sunArray_with_given_sum {
	//naive solution
public static boolean sum(int arr[],int n,int sum){
	int curr_sum = 0;
	for(int i=0;i<n;i++) {
		for(int j=i;j<n;j++) {
		curr_sum+=arr[j];
		if(curr_sum==sum) {
			return true;
		}
	}
	}
	return false;
}
//efficient solution
public static boolean sum2(int arr[],int n,int sum) {
	HashSet<Integer> h= new HashSet<>();
	int pref_sum=0;
	for(int i=0;i<n;i++) {
		pref_sum+=arr[i];
		if(pref_sum==sum) {
			return true;
		}
		int a = pref_sum-sum;
		if(h.contains(a)) {
			return true;
		}
		h.add(pref_sum);
	}
	return false;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {7,7,6,13};
int n=arr.length;
System.out.println(sum2(arr,n,14));
	}

}
