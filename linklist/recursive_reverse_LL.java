
public class recursive_reverse_LL {
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
//reverse method recursively
public Node reverse(Node head) {
	if(head==null||head.next==null) {
		return head;
	}
	Node newhead=reverse(head.next);
	Node tail_rest=head.next;
	tail_rest.next=head;
	head.next=null;
	return newhead;
}
// one more recursive method
public Node revserse1(Node curr,Node prev) {
	
	if(head==null) {
		return null;
	}
	if(curr==null) {
		return prev;
	}
	Node next=curr.next;
	curr.next=prev;
	return  revserse1(next,curr);
}
public int maximum(Node head)
{
    // your code here
	int max=Integer.MIN_VALUE;
    if(head==null){
        return 0;
    }
    if(head.next==null){
        return head.data;
    }
    Node curr=head;
    while(curr!=null){
        if(curr.data>max) {
        	max=curr.data;
        }
        curr=curr.next;
    }
    return max;
}
public int minimum(Node head)
{
    // your code here
    int min=Integer.MAX_VALUE;
    if(head==null){
        return 0;
    }
    if(head.next==null){
        return head.data;
    }
    Node curr=head;
    while(curr!=null){
    if(min>curr.data){
        min=curr.data;
   }
    curr=curr.next;
}
return min;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recursive_reverse_LL list = new recursive_reverse_LL();
		list.AddLast(10);
		list.AddLast(20);
		list.AddLast(30);
		list.AddLast(40);
		list.AddLast(50);
		list.AddLast(60);
		list.display();
		//list.head=list. revserse1(list.head,null);
		System.out.println("Max :"+list.maximum(list.head));
		System.out.println("Min :"+list.minimum(list.head));
		//list.display();
	}

}
