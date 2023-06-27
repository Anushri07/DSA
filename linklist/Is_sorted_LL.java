public class Is_sorted_LL {
	Node head;
	static class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
	public void AddFirst(int data) {
		Node newnode = new Node(data);
		if(head==null) {
			head=newnode;
			return;
		}
		newnode.next=head;
		head=newnode;
	}
	public void display(Node head) {
		Node curr=head;
		while(curr!=null) {
			System.out.print(curr.data+"->");
			curr=curr.next;
		}
		System.out.print("null");
		System.out.println();
	}
	public static boolean isSorted(Node head)
	  {
	      // your code here 
		 Node prev=head;
	     Node curr=head.next;
	     if(head==null||head.next==null) {
	    	 return true;
	     }
	     while(curr!=null&&curr.next!=null) {
	    	 if(prev.data<curr.data&&curr.data>curr.next.data
	    			 || prev.data>curr.data&&curr.data<curr.next.data) {
	    		 return false;
	    	 }
	    	 prev=curr;
	    	 curr=curr.next;
	     }
	     return true;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Is_sorted_LL list = new Is_sorted_LL();
		list.AddFirst(10);
		list.AddFirst(20);
		list.AddFirst(50);
		list.AddFirst(60);
		list.AddFirst(70);
		list.display(list.head);
		//	list.display(list.head);
		System.out.println(isSorted(list.head));;
	}

}
