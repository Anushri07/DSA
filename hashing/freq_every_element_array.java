import java.util.*;
public class freq_every_element_array {
public static void freq(int arr[],int n) {

	for (int i=0;i<n;i++) {
		boolean flag=false;
		for(int j=0;j<i;j++) {
			if(arr[i]==arr[j]) {
				flag=true;
				break;
			}
			if(flag==true) {
				continue;
			}
			int count=1;
			for(j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			System.out.println(arr[i]+" "+count);
		}
	}
}
//efficient solution
public static void frequency(int arr[],int n) {
	HashMap<Integer,Integer> h= new HashMap<>();
	for(int i=0;i<n;i++) {
		h.put(arr[i],h.getOrDefault(arr[i], 0)+1);
	}
	for(Map.Entry<Integer, Integer> e :h.entrySet()) {
		System.out.println(e.getKey()+" "+e.getValue());
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] ={1,2,3,3,4,2};
int n=arr.length;
frequency(arr,n);
	}

}
