
public class del_tail {
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
    public Node deleteTail(Node head)
    {
        // Your code here
        if(head==null) {
        	return null;
        }
        if(head.next==null) {
        	head=null;
        	return head;
        }
        Node curr=head;
        while(curr.next.next!=null) {
        	curr=curr.next;
        }
        curr.next=null;
        return head;
    }
   public Node deleteHead(Node head)
    { 
        if(head==null||head.next==null) {
        	return null;
        }
        return head.next;
    }
  public Node deleteAtPosition(Node head, int pos)
   {
      if(head==null||head.next==null) {
    	  return null;
      }
       if(pos==0) {
    	   head=head.next;
    	   return head;
       }
       Node prev=head;
       Node curr=head.next;
       for(int i=0;i<pos-1&&curr.next!=null;i++) {
    	  curr=curr.next; 
    	  prev=prev.next;
       }
       prev.next=curr.next;
       return head;
   }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		del_tail list = new del_tail();
		list.AddFirst(10);
		list.AddFirst(20);
		list.AddFirst(30);
		list.AddFirst(40);
		list.AddFirst(40);
		list.display(list.head);
//		list.deleteHead(list.head);
//		list.deleteAtPosition(list.head, 4);
		list.display(list.head);
		System.out.println(isSorted(list.head));;
		
	}

}
