import java.util.ArrayList;
import java.util.LinkedList;

class Myhash{
	int arr[];
	int cap,size;
	Myhash(int c){
		cap=c;
		//initially size of hash is zero
		size=0;
		//initially we initialize all array element empty
		for(int i=0;i<cap;i++) {
			arr[i]=-1;
		}
	}
	//hash function
    public int hash(int key) {
    	return key%cap;
    }
	public boolean insert(int key) {
		  if(size==cap) {
			  return false;
		  }
		  int i=hash(key);
		  while(arr[i]!=-1 && arr[i]!=key&&arr[i]!=-2) {
			  i=(i+1)%cap;
			  if(arr[i]==key) {
				  return false;
			  }else {
				  arr[i]=key;
				  size++;
				  return true;
			  }
		  }
	}
	public boolean search(int key) {
		int h=hash(key);
		int i=h;
		if(arr[i]!=-1) {
			return true;
		}
		i=(i+1)%cap;
		if(i==h) {
			return false;
		}
		return false;
	}
	public boolean erase(int key) {
		int h=hash(key);
		int i=h;
		if(arr[i]==key) {
			arr[i]=-2;
			return true;
		}
		i=(i+1)%cap;
		if(i==h) {
			return false;
		}
		return false;
	}
}
public class open_adressing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Myhash mh(7);
mh.insert(49);
mh.insert(56);
mh.insert(72);
if(mh.search(56)==true) {
	System.out.println("Yes");
}else {
	System.out.println("No");
}
mh.erase(56);
if(mh.search(56)==true) {
	System.out.println("Yes");
}else {
	System.out.println("No");
}
	}

}
