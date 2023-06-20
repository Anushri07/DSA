import java.util.*;
public class longest_subarray_with_01 {
public static int subarray(int arr[],int n) {
	int res=0;
	for(int i=0;i<n;i++) {
		int count1=0,count2=0;
		for(int j=i;j<n;j++) {
			if(arr[j]==0) {
				count1++;
			}else {
				count2++;
			}
			if(count1==count2) {
				res=Math.max(res, count1+count2);
			}
		}
	}
	return res;
}
//efficient solution
public static int subarray2(int arr[],int n) {
	HashMap<Integer,Integer> h = new HashMap<>();
	// we converted the all zeros in array into 1
	int pref_sum=0,res=0;
	for(int i=0;i<n;i++) {
		if(arr[i]==0) {
			arr[i]=-1;
		}
		//now implement the code of sub array with zero sum
		pref_sum+=arr[i];
		if(h.containsKey(pref_sum)==false) {
			h.put(pref_sum,i);
		}else {
			res=Math.max(res, i-h.get(pref_sum));
		}
		
	}
	return res;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int arr[] = {1,0,1,1,1,0,0};
int arr[] = {1,1,1,1};
int n=arr.length;
System.out.println(subarray2(arr,n));
	}

}
