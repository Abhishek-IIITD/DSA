public class DoublyLinkedList {

	private static class Node{
		int data;
		Node prev;
		Node next;
		Node(int d){
			data = d;
		}
	}
	
	private static void traversal(Node head){
		if(head == null){
			return;
		}
		Node p = head;
		Node q = head;
		while(p != null){
			System.out.println("Element:"+p.data);
			q = p;
			p = p.next;		
		}	
		System.out.println("Traversal in reverse direction");
		while(q != null){
			System.out.println("Element:"+q.data);
			q = q.prev;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(4);
		Node secondNode = new Node(3);
		Node thirdNode = new Node(8);
		head.next = secondNode;
		head.prev = null;
		secondNode.next = thirdNode;
		secondNode.prev = head;
		thirdNode.next = null;
		thirdNode.prev = secondNode;
		
		traversal(head);
	}

}
