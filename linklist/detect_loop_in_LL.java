
//This is the fastest method. Traverse linked list using two pointers. 
//Move one pointer by one step and another pointer by two-step.
//If these pointers meet at the same node then there is a loop. 
//If pointers do not meet then linked list doesn’t have a loop
public class detect_loop_in_LL {
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
	public boolean loop() {
		Node slow=head;
		Node fast=head;
		while(fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		if(slow==fast) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		detect_loop_in_LL list = new detect_loop_in_LL();
		list.AddFirst(10);
		list.AddFirst(20);
		list.AddFirst(50);
		list.AddFirst(60);
		list.AddFirst(70);
		list.display(list.head);
		System.out.println(list.loop());
	}

}
