import java.util.*;
public class longest_subarray_with_given_sum {
	//naive solution
public static int subarray(int arr[],int n,int sum) {
	int res=0;
	for(int i=0;i<n;i++) {
		int curr_sum=0;
		for(int j=i;j<n;j++) {
			curr_sum+=arr[j];
			if(curr_sum==sum) {
			  res=Math.max(res,j-i+1);	
			}
		}
	}
	return res;
}
//efficient solution
public static int subarray2(int arr[],int n,int sum) {
	HashMap<Integer,Integer> h = new HashMap<>();
	int pref_sum=0,res=0;
	for(int i=0;i<n;i++) {
		pref_sum+=arr[i];
		if(h.containsKey(pref_sum)==false) {
			h.put(pref_sum,i);
		}
		if(h.containsKey(pref_sum-sum)) {
			res= Math.max(res,i-h.get(pref_sum-sum));
		}
	}
	return res;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,2,3,4};
		int n=arr.length;
		System.out.println(subarray(arr,n,5));
	}

}
