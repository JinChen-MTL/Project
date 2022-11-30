public class doublelinklist {

	// node creation
	Node head;

	class Node {
		entry k;
		int data;
		Node prev;
		Node next;

		Node(entry k1) {
			k = k1;
		}
	}

	// insert node at the front
	public void insertFront(entry k) {
		// allocate memory for newNode and assign data to newNode
		Node newNode = new Node(k);

		// make newNode as a head
		newNode.next = head;

		// assign null to prev of newNode
		newNode.prev = null;

		// previous of head (now head is the second node) is newNode
		if (head != null)
			head.prev = newNode;

		// head points to newNode
		head = newNode;
	}

	// insert a node after a specific node
	public void insertAfter(Node prev_node, entry k) {

		// check if previous node is null
		if (prev_node == null) {
			System.out.println("previous node cannot be null");
			return;
		}

		// allocate memory for newNode and assign data to newNode
		Node new_node = new Node(k);

		// set next of newNode to next of prev node
		new_node.next = prev_node.next;

		// set next of prev node to newNode
		prev_node.next = new_node;

		// set prev of newNode to the previous node
		new_node.prev = prev_node;

		// set prev of newNode's next to newNode
		if (new_node.next != null)
			new_node.next.prev = new_node;
	}

	// insert a newNode at the end of the list
	void insertEnd(entry k) {
		// allocate memory for newNode and assign data to newNode
		Node new_node = new Node(k);

		// store the head node temporarily (for later use)
		Node temp = head;

		// assign null to next of newNode
		new_node.next = null;

		// if the linked list is empty, make the newNode as head node
		if (head == null) {
			new_node.prev = null;
			head = new_node;
			return;
		}

		// if the linked list is not empty, traverse to the end of the linked list
		while (temp.next != null)
			temp = temp.next;

		// assign next of the last node (temp) to newNode
		temp.next = new_node;

		// assign prev of newNode to temp
		new_node.prev = temp;
	}

	// delete a node from the doubly linked list
	void deleteNode(Node del_node) {

		// if head or del is null, deletion is not possible
		if (head == null || del_node == null) {
			return;
		}

		// if del_node is the head node, point the head pointer to the next of del_node
		if (head == del_node) {
			head = del_node.next;
		}

		// if del_node is not at the last node, point the prev of node next to del_node
		// to the previous of del_node
		if (del_node.next != null) {
			del_node.next.prev = del_node.prev;
		}

		// if del_node is not the first node, point the next of the previous node to the
		// next node of del_node
		if (del_node.prev != null) {
			del_node.prev.next = del_node.next;
		}

	}

	boolean search(entry k1) {
		Node head_ref=this.head;
		Node temp = head_ref;
		while (temp.k.getKey() != k1.getKey() && temp.next != null) {
			temp = temp.next;
		}

		if (temp.k.getKey() != k1.getKey())
			return true;
		// If the integer present in
		// the doubly linked list
		return false;
	}

	// print the doubly linked list
	public void printlist(Node node) {
		Node last = null;
		while (node != null) {
			System.out.print(node.k + "->");
			last = node;
			node = node.next;
		}
		System.out.println();
	}

}