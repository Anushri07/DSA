
public class join_LL {
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
public void display(Node head) {
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
public  Node joinTheLists(Node head1, Node head2)
{
       // your code here
       Node curr1=head1;
       while(curr1.next!=null){
           curr1=curr1.next;
       }
       curr1.next=head2;
       return head1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		join_LL  list = new join_LL ();
		join_LL  list2 = new join_LL ();
		list.AddLast(10);
		list.AddLast(20);
		list.AddLast(30);
		list.AddLast(40);
		list.AddLast(50);
		list.AddLast(60);
		list.display(list.head);
		list2.AddLast(70);
		list2.AddLast(50);
		list2.AddLast(60);
		list2.display(list2.head);
		list.joinTheLists(list.head, list2.head);
		list.display(list.head);
	}

}
