package recursion;

public class sum_of_numbers {
  public static int sumRecursion(int n) {
	  if(n==0) {
		  return 0;
	  }
	  return n+sumRecursion(n-1);
	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int res = sumRecursion(5);
   System.out.println(res);
	}

}
