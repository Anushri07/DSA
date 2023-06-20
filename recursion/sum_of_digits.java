package recursion;

public class sum_of_digits {
public static int sum(int n) {
	if(n<=9) {
		return n;
	}
	// last digit=n%10
	//n/10 removes last digit
	return sum(n/10)+n%10;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int res = sum(123);
   System.out.println(res);
	}

}
