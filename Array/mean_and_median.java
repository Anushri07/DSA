import java.util.*;
public class mean_and_median {
	public static int mean(int A[],int N)
    {
       //Your code 
       int sum=0;
       for(int i=0;i<N;i++){
           sum=sum+A[i];
       }
       int mean = sum/N;
       return mean;
    }
	public static int median(int A[],int N)
    {
       Arrays.sort(A);
       System.out.println();
       if(N%2!=0) {
    	   //odd
    	   int med= N/2;
    	   return A[med];
       }
    	   //even
       int a = N/2-1,b=(N/2);
    	 int median= (A[a]+A[b])/2;
       return median;
       
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {2, 8, 3, 4};
		int n=A.length;
		int res = mean(A,n);
		System.out.println(res);
		int result = median(A,n);
		System.out.println(result);
	}

}
