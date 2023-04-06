public class Deletion {

	private static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
		}
	}
	
	private static void traversal(Node currentNode){
		while(currentNode != null){
			System.out.println("Element:"+currentNode.data);
			currentNode = currentNode.next;
		}
	}
	
	private static Node deleteFirstNode(Node head){
		if(head == null)
			return head;
		head = head.next;
		return head;
	}
	
	private static void deleteAtIndex(Node head, int index){
		if(head == null)
			return;
		
		if(index == 0){
			head = head.next;
			return;
		}
		Node p = head;
		int counter = 0;
		while(counter != index - 1 && p.next != null){
			p = p.next;
			counter++;
		}
		if(p == null || p.next == null){ //if index given is more than number of nodes
			return;
		}
		Node q = p.next;
		p.next = q.next;
		}
	
	private static void deleteLastNode(Node head){
		if(head == null)
			return;
		
		Node p = head;
		Node q = head.next;
		while(q.next != null){
			p = p.next;
			q = q.next;
		}
		p.next = null;
	}
	
	private static void deleteElementWithGivenValue(Node head, int value){
		if(head == null)
			return;
		if(head.data == value){
			head = head.next;
			return;
		}	
		Node p = head;
		Node q = head.next;
		while(q.data != value && q.next != null){
			p = p.next;
			q = q.next;
		}		
		if(q.data != value){
			return;
		}	
		p.next = q.next;	
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
		//traversal(head);
		//head = deleteFirstNode(head);
		deleteAtIndex(head, 2);
		//deleteLastNode(head);
		//deleteElementWithGivenValue(head, 3);
		traversal(head);
	}

}
