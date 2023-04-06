
public class QueueUsingLinkedList {
	static Node front = null;
	static Node rear = null;	
	static class Node{
		int data;
		Node next;
		Node(int d){ //by default, next would be null
			data = d;
		}
	}
	
	static void linkedListTraversal(Node ptr){
		while(ptr != null){
			System.out.println("Element :"+ptr.data);
			ptr = ptr.next;
		}
	}
	
	static void enqueue(int val){
		Node newNode = new Node(val);
		if(newNode == null){
			System.out.println("Queue is full");
		}else{
			if(front == null){
				front = rear = newNode;
			}else{
			rear.next = newNode;
			rear = newNode;
			}
		}
	}
	
	static int dequeue(){
		int val = -1;
		Node deleteNode = front;
		if(front == null){
			System.out.println("Queue is empty");
		}else{
			front = front.next;
			val = deleteNode.data;
		}
		return val;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enqueue(2);
		enqueue(3);
		enqueue(4);
//		linkedListTraversal(front);
		dequeue();
		linkedListTraversal(front);
		
	}

}
