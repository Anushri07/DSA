package recursion;

public class tower_of_hanoi {
public static void TOH(int n,int a,int b,int c) {
	if(n==1) {
		System.out.println("Move 1 from "+a+" to "+c);
		return;
	}
	TOH(n-1,a,c,b);
	System.out.println("move "+n+" from "+a+" to "+c);
	TOH(n-1,b,a,c);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  TOH(3,1,2,3);
	}

}
