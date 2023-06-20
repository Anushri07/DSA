package recursion;

public class sequence {
	public static int theSequence(int N)
    {
        // your code here
        if(N==0){
            return 1;
        }
        return  N+ N*(theSequence(N-1));
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int res=theSequence(3);
System.out.println(res);
	}

}
