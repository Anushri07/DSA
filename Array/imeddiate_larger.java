
public class imeddiate_larger {
public static int large(int arr[],int n,int x) {
	int l=0;
	//finding larger element in array
    for(int i=0;i<n;i++){
        if(arr[i]>l){
            l=arr[i];
        }
    }
    int large=l;
    for(int i=0;i<n;i++){
        if(arr[i]>x && arr[i]<large){
            large=arr[i];
        }
    }
    if(large==100){
        return -1;
    }
    return large;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4 ,67, 13, 12, 15};
		int n = arr.length;
		int res = large(arr,n,16);
		System.out.println(res);
	}

}
