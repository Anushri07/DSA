
public class max_and_min {
public static int max(int arr[],int n) {
	int max=0;
	for(int i=0;i<n;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	return max;
}
public static int min(int arr[],int n) {
	int min=10000;
for(int i=0;i<n;i++) {
	if(arr[i]<=min) {
		min=arr[i];
	}
	}
   return min;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {135,546,399,426,575,249,447,676,975,131};
		int n=arr.length;
		int max = max(arr,n);
		System.out.println(max);
		int min = min(arr,n);
		System.out.println(min);
	}

}
