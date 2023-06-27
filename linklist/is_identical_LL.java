public class is_identical_LL {
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
public boolean isIdentical (Node head1, Node head2){
    //write your code here 
    Node curr1=head1;
    Node curr2=head2;
    int count1=0,count2=0;
    while(curr1!=null) {
    	count1++;
    	curr1=curr1.next;
    }
    while(curr2!=null) {
    	count2++;
    	curr2=curr2.next;
    }
    if(count1!=count2) {
    	return false;
    }
    if(head1.data!=head2.data) {
    	return false;
    }
    while(curr1!=null && curr2!=null){
        if(curr1.data!=curr2.data) {
        	curr1=curr1.next;
            curr2=curr2.next;
        }else {
        	return false;
        }
    }
    return true;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		is_identical_LL list = new is_identical_LL();
		is_identical_LL list2 = new is_identical_LL();
		list.AddLast(10);
		list.AddLast(20);
		list.AddLast(30);
		list.AddLast(40);
		list.AddLast(50);
		list.AddLast(60);
		list.display();
		list2.AddLast(10);
		list2.AddLast(20);
		list2.AddLast(30);
		list2.AddLast(70);
		list2.AddLast(50);
		list2.AddLast(60);
		list2.display();
		System.out.println(list2.isIdentical(list.head, list2.head));
	}

}
