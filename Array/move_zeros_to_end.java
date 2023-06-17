
public class move_zeros_to_end {
	//naive solution
public static void move(int arr[],int n) {
	//traverse the array
	for(int i=0;i<n;i++) {
		//search for zero element
		if(arr[i]==0) {
			//search nearby on right side non zero element
			for(int j=i+1;j<n;j++) {
				//nonzero element find
				if(arr[j]!=0) {
					//swap
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
}
public static void display(int arr[],int n) {
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}
}
//efficient solution
public static void movezeros(int arr[],int n) {
	//intially make count zero
	int count=0;
	for(int i=0;i<n;i++) {
		if(arr[i]!=0) {
			//swap arr[i] and arr[count]
			int temp = arr[i];
			arr[i]=arr[count];
			arr[count]=temp;
			count++;
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {1,2,0,0,3,0,4,0};
int n=arr.length;
movezeros(arr,n);
display(arr,n);
	}

}
