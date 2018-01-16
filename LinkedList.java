package DSJ;

// Following the is Basic implementation of The Single Linked List in java
// create public class LinkedList
public class LinkedList {

	// create a global Head reference.
	LinkedListNode head;
	
	// variable to keep track the size of the linked list
	 private int size=0;

/*******************************************************************************/	 
// Add element at the beginning of the list	 
public LinkedListNode addAtStart(int x) {
	
	// create a node with Element X
	LinkedListNode node=new LinkedListNode(x);
	
	// assign the head of the node to the link of the new node
	node.link=head;
	
	// point the reference of the head to the new created node || store ref of new node in the head 
	head=node;
	
	// Increment the size of the linkedlist
	size++;
	
	// linked List start from head, return head for next node.
	return head;
}

/*******************************************************************************/
// Add Element at the end of the list
public void addAtLast(int x) {
	// Create a node with Element x
	LinkedListNode node=new LinkedListNode(x);
	
	// Check if LinkedList empty || head is null
	if(head==null) {
		head=node;
		size++;
		return;
		}
	
	// create another ref. and store head in it.
	LinkedListNode end=head;
	
	// traverse linked list until it's node link is not null
	while(end.link!=null) {
		end=end.link;
		}
	
	// store the ref of last node in the end variable
	// and the last node link is null, point the link of last node to new created node
	end.link=node;
	
	// increment linked list size
	size++;
}

/******************************************************************************************/
// add element at the given position in the Linkedlist
public LinkedListNode addAt(int x, int position) {
	
	// create new node with Element X
	LinkedListNode node=new LinkedListNode(x);
	
	//Check if position is zero or beginning of linked list
	if(position==0) {
	// same as inserting at beginning of linked list		
		node.link=head;
		head=node;
		size++;
		return head;
	}
	
	// create a temporary node ref. and point it to head;
	LinkedListNode temp=head;
	
	// traverse list one less than the position
	for(int i=1;i<position;i++) {
		temp=temp.link;
	}
	
	//point the link of the node to the link of the temporary ref variable
	// link of the temporary ref. variale point to the link of next node from the position of the node to be inserted
	// point the link of the temporary ref. to the node.
	node.link=temp.link;
	temp.link=node;
		
	size++;			// Increment the size of the linkedlist
	return head;
}

/**************************************************************************************/
// Remove node at the given position
public void removeNode(int position) {
	
	// check if list is empty
	 if (head == null)
         return;

     // Store head into temp ref variable
     LinkedListNode temp = head;

     // If head needs to be removed
     if (position == 0)
     {
         head = temp.link;   // Change head
         return;
     }

     // Find previous node of the node to be deleted
     for (int i=0; temp!=null && i<position-1; i++)
         temp = temp.link;

     // If position is more than number of nodes
     if (temp == null || temp.link == null)
         return;

     // Node temp->link is the node to be deleted
     // Store pointer to the next of node to be deleted
     LinkedListNode next = temp.link.link;

     temp.link = next;
     size--;		// reduce the size of the linked list
}

/**********************************************************************************/
// Delete element from linked list
public void removeElement(int x) {

	// Check if list is empty
	if(head==null) return;
	
	// Store head into a node ref variable;
	LinkedListNode node=head;
	// check if element removed is the first element
	if(node.data==x) {
		head=node.link;		// point head to next node
	}
	
	else { // traverse linked list until next to next node element matches the removal element
		
		while(node.link.data!=x) {		//	node->node.data!=X
		node=node.link;					
	}
		
	// Point the ref of next to next node to a temporary ref variable. || store link of next node in a temporary ref variable	
	LinkedListNode temp=node.link;
	
	//Cut the Link, point link of the current node to link of next node i.e link of temporary ref variable
	node.link=temp.link;
	}
	size--;			// reduce size of the linked list
}

/*************************************************************************************/
//Print all the elements of the Linkedlist 
public void TraverseList() {
	
	// Store the head into temp ref variable
	LinkedListNode temp=head;
	
	// traverse linked list until node is not null;
	while(temp!=null) {
		
		// print the data of the current node
		System.out.print(temp.data+" ");
		// point temp to link of temp
		temp=temp.link;
	}
	System.out.println();
}

/********************************************************************************/
// Reverse a LinkedList

public LinkedListNode reverse() {
	
	// create three variable next, current,previous
	// point next to null, current to head, previous to null
	LinkedListNode next=null;
	LinkedListNode current=head;
	LinkedListNode previous=null;
	
	// traverse linked list until current is not null;
	while(current!=null) {
						
		next=current.link;      // store link of current into next
		current.link=previous;	// point link of current to previous 
		previous=current;		// store current into previous
		current=next;			// point next into current
	}
	
	// in reversal we are moving head to end of the Linked List and reverse the link point of each node
	// as link of each next node will point to previous node, at last previous will point to last node
	// so previous must be stored in head || head point previous to create starting point of linked list
	head=previous;
	return head;
}

/****************************************************************************************/
// Print the size of the array
public int size() {

	System.out.println(size);
	return size;
}

public static void main(String args[]) {
	
	// Create Object of the linked List
	LinkedList l=new LinkedList();
	l.addAtStart(10);
	l.addAtStart(20);
	l.addAtStart(6);
	l.TraverseList();
	l.size();
	l.addAtLast(14);
	l.addAtLast(65);
	l.TraverseList();
	l.size();
	l.addAt(91,2);
	l.addAt(41, 4);
	l.TraverseList();
	l.size();
	l.removeNode(3);
	l.TraverseList();
	l.size();
	l.reverse();
	l.TraverseList();
	l.reverse();
	System.out.println();
	l.TraverseList();
	System.out.println();
	l.removeElement(6);
    l.removeElement(65);
	l.removeElement(91);
	l.removeElement(41);
	l.removeElement(20);
	l.removeElement(14);
	l.TraverseList();
	l.size();
	l.addAtLast(7);
	l.addAtLast(9);
	l.addAtStart(5);
	l.addAtStart(3);
	l.TraverseList();
	l.size();
	l.reverse();
	l.TraverseList();
}

}
