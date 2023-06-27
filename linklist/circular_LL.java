
public class circular_LL {
	Node head;
	static class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
	// naive solution
	public Node AddFirst(Node head,int data) {
		Node newnode =new Node(data);
		Node curr=head;
		if(head==null) {
			newnode.next=newnode;
			return newnode;
		}
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=newnode;
		newnode.next=head;
		
		return newnode;
	}
	//efficient implementation
	public Node insertFirst(Node head,int data) {
		//insert the newnode after head and then swap the data between 2
		Node newnode = new Node(data);
		if(head==null) {
			newnode.next=newnode;
			head=newnode;
			return head;
		}
		newnode.next=head.next;
		head.next=newnode;
		int temp=head.data;
		head.data=newnode.data;
		newnode.data=temp;
		return head;
	}
	public Node insertEnd(Node head,int data) {
		Node newnode= new Node(data);
		if(head==null) {
			newnode.next=newnode;
			return newnode;
		}
		Node curr=head;
		while(curr.next!=head) {
			curr=curr.next;
		}
		curr.next=newnode;
		newnode.next=head;
		return head;
	}
	//efficient implementation
	public Node insertLast(Node head,int data) {
		Node newnode = new Node(data);
		if(head==null) {
			newnode.next=newnode;
			return newnode;
		}
		newnode.next=head.next;
		head.next=newnode;
		int temp=newnode.data;
		newnode.data=head.data;
		head.data=temp;
		return newnode;
	}
	//method 1 to traverse CLL
	public void display(Node head) {
		if(head==null) {
			return ;
	}
		Node curr=head.next;	
		System.out.println(head.data);
		while(curr!=head) {
			System.out.print(curr.data+"->");
			curr=curr.next;
		}
		//System.out.print("null");
		System.out.println();
	}
		//method2 to traverse CLL
		public void display2(Node head) {
			Node curr=head;
			if(curr==null) {
				return ;
			}
			do {
				System.out.print(curr.data+"->");
				curr=curr.next;
			}while(curr!=head);
			System.out.println();
		}
		//naive approach
		public Node deletehead(Node head) {
			if(head==null||head.next==head) {
				return null;
			}
			Node curr=head;
			while(curr.next!=head) {
				curr=curr.next;
			}
			curr.next=head.next;
			head=curr.next;
			return head;
		}
		//efficient solution
		public Node deletehead2(Node head) {
			if(head==null||head.next==head) {
				return null;
			}
			//store the head next data to the head
			head.data=head.next.data;
			//delete the head next
			head.next=head.next.next;
			return head;
		}

	    public void insertAtPosition(Node head, int pos, int data)
	    {
	        // your code here
	        Node newnode = new Node(data);
	        Node curr=head;
	        if(pos==0){
	        newnode.next=head.next;
	        head.next=newnode;
	        int temp=newnode.data;
	        newnode.data=head.data;
	        head.data=temp;
	        return ;
	        }
	        int count=0;
	        while(curr.next!=head){
	            curr=curr.next;
	            count++;
	        }
	        if(curr.next==head) {
	        	count++;
	        }
	        System.out.println(count);
	        if(pos>count){
	        	System.out.println("Cant insert the elemenet");
	            return;
	        }
	        
	        for(int i=1;i<=pos;i++) {
				curr=curr.next;
			}
			Node next=curr.next;
	        curr.next=newnode;
	        newnode.next=next;	
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circular_LL l = new circular_LL();
		l.head=l.insertFirst(l.head, 10);
		l.insertFirst(l.head, 30);
		l.insertFirst(l.head, 40);
		l.insertEnd(l.head,20);
		l.head=l.insertLast(l.head, 70);
		l.display2(l.head);
		l.head=l.deletehead(l.head);
		l.display2(l.head);
		l.deletehead2(l.head);
		l.display2(l.head);
		l.insertAtPosition(l.head, 2, 2);
		l.display2(l.head);
	}

}
