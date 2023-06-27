
public class insert_at_middle {
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
	public Node insertInMid(Node head, int data){
        //Insert code here, return the head of modified linked list
        Node newnode = new Node(data);
        if(head==null){
            head=newnode;
            return head;
        }
        Node slow=head;
        Node fast=head.next;
        while(fast!=null&&fast.next!=null){
        	
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
        Node next=slow.next;
        slow.next=newnode;
        newnode.next=next;
        return head;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insert_at_middle list = new insert_at_middle();
		list.AddLast(10);
		list.AddLast(20);
		list.AddLast(30);
		list.AddLast(40);
		list.AddLast(50);
		list.AddLast(60);
		list.display();
		list.insertInMid(list.head, 35);
		list.display();
	}

}
