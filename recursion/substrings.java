package recursion;

public class substrings {
public static void subsets(String str,int i,String curr) {
	if(i==str.length()) {
		System.out.print(curr+" ");
		return;
	}
	subsets(str,i+1,curr);
	subsets(str,i+1,curr+str.charAt(i));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABC";
  subsets(str,0," ");
	}

}
