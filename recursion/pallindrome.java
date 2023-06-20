package recursion;

public class pallindrome {
public static boolean pallindrome(String str,int start,int end) {
	if(start>=end) {
		return true;
	}
	return (str.charAt(start)==str.charAt(end))&&pallindrome(str,start+1,end-1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "WoW";
		int n = str.length();
      boolean p = pallindrome(str,0,n-1);
      System.out.println(p);
	}

}
