

public class Nth_node_from_end {
	
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
	public int nthNode(int n) {
		Node first=head,second=head;
		if(head==null) {
			return 0;
		}
		for(int i=0;i<n;i++) {
			if(first==null) {
				return -1;
			}
			first=first.next;
		}
		while(first!=null) {
			first=first.next;
			second=second.next;
		}
		return second.data;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nth_node_from_end list = new Nth_node_from_end();
		list.AddLast(10);
		list.AddLast(5);
		list.AddLast(100);
		list.AddLast(5);
		list.AddLast(50);
		list.AddLast(60);
		list.display();
		System.out.println(list.nthNode(5));;
	}

}
