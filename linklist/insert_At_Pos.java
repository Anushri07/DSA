
public class insert_At_Pos {
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
public void insertAtPosition(Node head, int pos, int data)
{
    // your code here
    Node curr=head;
Node newnode = new Node(data);
if(head==null) {
	return;
}
if(pos==1) {
	newnode.next=head;
	head=newnode;
	return;
}
for(int i=1;i<=pos-1&&curr!=null;i++) {
    
	curr=curr.next;
//	if(curr.next==null){
//        return;
//    }
}
newnode.next=curr.next;
curr.next=newnode;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insert_At_Pos list = new insert_At_Pos();
		list.AddLast(10);
		list.AddLast(20);
		list.AddLast(30);
		list.AddLast(40);
		list.AddLast(50);
		list.AddLast(60);
		list.display();
		list.insertAtPosition(list.head, 6, 55);
		list.display();
	}

}
