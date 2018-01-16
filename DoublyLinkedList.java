package DSJ;

public class DoublyLinkedList {

	DoublyLinkedListNode head;
	int size =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList dl=new DoublyLinkedList();
		dl.insert(5);
		dl.insert(4);
		dl.insert(6);
		dl.insert(8);
		dl.insert(9);
		dl.traverseForward();
		dl.traverseBackward();
		dl.size();
	}

void insert(int x) {
	DoublyLinkedListNode node=new DoublyLinkedListNode(x);
	if(head==null) {
		head=node;
		size++;
		return;		
	}
	head.previous=node;
	node.next=head;
	head=node;
	size++;
}

void traverseForward() {
	DoublyLinkedListNode node=head;
	System.out.println("Forward");
	if(node==null) {
		System.out.println("List is Empty");
		return;
	}
	while(node!=null) {
		System.out.print( node.data+" ");
		node=node.next;
	}
	System.out.println();
}


void traverseBackward() {
	DoublyLinkedListNode node=head;
	System.out.println("Backward");
	if(node==null) {
		System.out.println("List is Empty");
		return;
	}
	
	while(node.next!=null) {
		node=node.next;
	}
	
	while(node!=null) {
		System.out.print(node.data+" ");
		node=node.previous;
	}
	System.out.println();
}

int size() {
	System.out.println(size);
	return size;
}
}
