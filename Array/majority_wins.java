
public class majority_wins {
	public static int majorityWins(int arr[], int n, int x, int y) {
        // code here
        int count1=0,count2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                count1++;    
            }
            if(arr[i]==y){
                count2++;
            }
        }
        if(count1==1&&count2==1) {
        	if(x<y) {
        		return x;
        	}
        	return y;
        }
        if(count1==count2) {
        	if(x<y) {
        		return x;
        	}
        	return y;
        }
        if(count1>count2){
            return x;
        }else{
            return y;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int arr[] = {1,1,2,2,3,3,4,4,4,4,5};
int arr[] = {1,2,3,4,5};
//int arr[] = {1,3,2,2,3,4,5};
int n=arr.length;
int res = majorityWins(arr,n,8,7);
System.out.println(res);
	}

}
