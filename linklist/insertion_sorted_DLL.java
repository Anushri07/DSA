
public class insertion_sorted_DLL {
	Node head;
	class Node{
		int data;
		Node next;
		Node prev;
		Node(int data){
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
	public Node insertBeg(Node head,int data) {
		Node newnode=new Node(data);
		if(head==null) {
			head=newnode;
			return head;
		}
		newnode.next=head;
		head.prev=newnode;
		head=newnode;
		return head;
	}
	public void display(Node head) {
		if(head==null) {
			return;
		}
		Node curr=head;
		while(curr!=null) {
			System.out.print(curr.data+"->");
			curr=curr.next;
		}
		System.out.println();
	}
	 public Node sortedInsert(Node head, int x)
	    {
		 Node newnode = new Node(x);
	        if(head==null) {
	        	head=newnode;
	        	return head;
	        }
	        if(x<head.data) {
	        	newnode.next=head;
	        	head.prev=newnode;
	        	newnode.prev=null;
	        	return newnode;
	        }
	        Node curr=head;
	        while(curr!=null) {
	        	if(curr.data>x) {
	        		Node prev=curr.prev;
	        		newnode.next=curr;
	        		curr.prev=newnode;
	        		newnode.prev=prev;
	        		prev.next=newnode;
	        	}
		        if(curr.next==null) {
		        	curr.next=newnode;
		        	newnode.prev=curr;
		        	newnode.next=null;
		        }
	        	curr=curr.next;
	        }

	        return head;
	    }
	public  Node deleteNode(Node head,int x)
	    {
		// Your code here	
		if(x==1){
		    head=head.next;
		    head.prev=null;
		    return head;
		}
		Node curr=head;
		for(int i=1;i<x-1;i++) {
			curr=curr.next;
		}
		Node next =curr.next.next;
		curr.next=curr.next.next;
		next=curr.prev;
		return head;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertion_sorted_DLL l =new insertion_sorted_DLL();
		l.head=l.insertBeg(l.head, 40);
		l.head=l.insertBeg(l.head, 30);
		l.head=l.insertBeg(l.head, 20);
		l.head=l.insertBeg(l.head, 10);
		l.display(l.head);
		l.head=l.sortedInsert(l.head, 45);
		l.display(l.head);
		l.head = l.deleteNode(l.head, 1);
		l.display(l.head);
		
		
	}

}
