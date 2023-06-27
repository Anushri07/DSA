
public class Doubly_LL {
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
public void addNode(Node head, int pos, int data)
{
	// Your code here
	Node curr=head;
	Node newnode =new Node(data);
	int count=0;
	while(curr!=null){
	    count++;
	    curr=curr.next;
	}
	if(pos>count) {
		return;
	}
	if(pos==0) {
		//insertion at beg
		newnode.next=head.next;
		head.next=newnode;;
		newnode.prev=head;
		return ;
	}
	curr=head;
	for(int i=0;i<pos;i++) {
		curr=curr.next;
	}
	if(curr.next==null) {
		curr.next=newnode;
		newnode.prev=curr;
		newnode.next=null;
		return;
	}
	Node next=curr.next;
	curr.next=newnode;
	newnode.prev=curr;
	newnode.next=next;
	next.prev=newnode;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doubly_LL l = new Doubly_LL();
		l.head=l.insertBeg(l.head, 40);
		l.head=l.insertBeg(l.head, 30);
		l.head=l.insertBeg(l.head, 20);
		l.head=l.insertBeg(l.head, 10);
		l.display(l.head);
		l.addNode(l.head, 0, 5);
		l.display(l.head);
	}

}
