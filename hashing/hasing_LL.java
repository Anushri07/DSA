import java.util.*;
//implementation of chaining 
 class hash{
	int bucket;
	ArrayList<LinkedList<Integer>>table;
	hash(int b){
		bucket=b;
		table=new ArrayList<LinkedList<Integer>>();
		
	}
	public  void insert(int key) {
		int i=key%bucket;
		table.get(i).add(key);
	}
	public  void delete(int key) {
		int i=key%bucket;
		table.get(i).remove((Integer)i);
	}
	public boolean search(int key) {
		int i = key%bucket;
		return table.get(i).contains(key);
	}
}
public class hasing_LL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
