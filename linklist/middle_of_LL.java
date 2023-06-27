

public class middle_of_LL {
	Node head;
	static class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
public void AddLast(int data) {
	Node curr=head;
	Node newnode = new Node(data);
	if(head==null) {
		head=newnode;
		return;
	}
	while(curr.next!=null) {
		curr=curr.next;
	}
	curr.next=newnode;
	newnode.next=null;
}
public void display() {
	Node curr=head;
	if(head==null) {
		return;
	}
	while(curr!=null) {
		System.out.print(curr.data+"->");
		curr=curr.next;
	}
	System.out.print("null");
	System.out.println();
}
public void middle() {
	Node slow=head,fast=head;
	if(head==null) {
		return;
	}
	while( fast!=null&&fast.next!=null) {
		slow=slow.next;
		fast=fast.next.next;
	}
	System.out.println(slow.data);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		middle_of_LL list = new middle_of_LL();
		list.AddLast(10);
		list.AddLast(20);
		list.AddLast(30);
		list.AddLast(40);
		list.AddLast(50);
		list.AddLast(60);
		list.display();
		list.middle();
	}

}
