
public class LinkedList {
	
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
		}
	}
	
	static void traversal(Node currentNode){
		while(currentNode != null){
			System.out.println("Element:"+currentNode.data);	
			currentNode = currentNode.next;	
		}
	}
	
	static Node insertAtIndex(Node head, int data, int index){
		int i = 0;
		Node previousNode = head;
		Node newNode = new Node(data);
		while(i != index - 1){
			previousNode = previousNode.next;
			i++;
		}
		newNode.next = previousNode.next;
		previousNode.next = newNode;
		return head;
	}
	
	static Node insertAtFirst(Node head, int data){
		Node newNode = new Node(data);
		newNode.next = head;
		return newNode;
	}
	
	static Node insertAtEnd(Node head, int data){
		Node newNode = new Node(data);
		Node previousNode = head;
		while(previousNode.next != null){
			previousNode = previousNode.next;
		}
		previousNode.next = newNode;
		return head;
	}
	
	static Node insertAfterNode(Node head, Node previousNode, int data){
		Node newNode = new Node(data);
		newNode.next = previousNode.next;
		previousNode.next = newNode;
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(4);
		Node secondNode = new Node(5);
		Node thirdNode = new Node(6);
		head.next = secondNode;
		secondNode.next = thirdNode;
		//traversal(head);
		//head = insertAtFirst(head, 7);
		//head = insertAtIndex(head, 7, 2); //It will not work for 0th index as its not insert in beginning
		//head = insertAtEnd(head, 71);
		head = insertAfterNode(head, secondNode, 7);

		traversal(head);
	}

}
