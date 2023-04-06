public class CircularLinkedList {

	private static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
		}
	}
	
	private static void traversal(Node head){
		Node p = head;
		do{
			System.out.println("Element:"+p.data);
			p = p.next;
		}while(p!=head);
	}
	
	private static Node insertAtBeginning(Node head, int data){
		Node newNode = new Node(data);
		Node p = head.next;
		while(p.next != head){
			p = p.next;
		}
		p.next = newNode;
		newNode.next = head;
		head = newNode;
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(4);
		Node secondNode = new Node(3);
		Node thirdNode = new Node(8);
		Node fourthNode = new Node(1);
		head.next = secondNode;
		secondNode.next = thirdNode;
		thirdNode.next = fourthNode;	
		fourthNode.next = head;
		head = insertAtBeginning(head, 54);
		traversal(head);
	}

}
