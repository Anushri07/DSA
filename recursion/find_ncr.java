package recursion;

public class find_ncr {
	public static int nCr(int n,int r)
    {
        // your code here
        if(n==r||r==0){
            return 1;
        }
        int a =  nCr(n-1,r-1) + nCr(n-1,r);
        return a;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int res = nCr(5,2);
System.out.println(res);
	}

}
