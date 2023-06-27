public class delete_kth_CLL {
	Node head;
	static class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
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
	public Node delete_kth(Node head,int k) {
		if(head==null) {
			return null;
		}
		if(k==1) {
			head.data=head.next.data;
			head.next=head.next.next;
			return head;
		}
		Node curr=head;
		for(int i=0;i<k-2;i++) {
			curr=curr.next;
		}
		curr.next=curr.next.next;
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		delete_kth_CLL l = new delete_kth_CLL();
		l.head=l.insertLast(l.head, 10);
		l.head=l.insertLast(l.head, 20);
		l.head=l.insertLast(l.head, 30);
		l.head=l.insertLast(l.head, 40);
		l.display2(l.head);
		l.delete_kth(l.head, 2);
		l.display2(l.head);
	}

}
