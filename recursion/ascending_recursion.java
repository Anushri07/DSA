package recursion;

public class ascending_recursion {
public static void recursion(int n) {
	if(n==0){
		return ;
	}
	recursion(n-1);
	System.out.println(n);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  recursion(5);
	}

}
