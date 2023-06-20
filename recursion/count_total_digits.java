package recursion;

public class count_total_digits {
public static int count(int n) {
	if(n<=9) {
		return 1;
	}
	//we added 1 to count first digit
	return 1+count(n/10);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int res=count(253);
System.out.println(res);
	}

}
