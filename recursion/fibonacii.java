package recursion;

public class fibonacii {
//public static void fibonacci(int n,int a,int b) {
//	if(n==0||n==1) {
//		return;
//	}
//	int sum = a+b;
//	a=b;
//	b=sum;
//	System.out.print(sum+" ");
//	fibonacci(n-1,a,b);
//}
	public static int fibonacci(int n)
    {
        // your code here
        if(n==0||n==1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1;
//System.out.print(0+" "+1+" "); 
int res  = fibonacci(10);
System.out.println(res);
	}

}
