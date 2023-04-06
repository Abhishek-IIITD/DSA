import java.util.Stack;

public class StackUsingLinkedList {

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

	static boolean isEmpty(Node top){
		return (top == null)?true:false;
	}
	
	static boolean isFull(){
		Node newNode = new Node(3);
		return (newNode == null)?true:false;
	}
	
	static Node push(Node top, int x){
		if(isFull()){
			System.out.println("Stack Overflow");
		}else{
			Node newNode = new Node(x);
			newNode.next = top;
			top = newNode;
		}
		return top;
	}
	
	static Node pop(Node top){
		if(isEmpty(top)){
			System.out.println("Stack Underflow");
		}else{
			top = top.next;
		}
		return top;
	}
	
	static int peek(Node top, int pos){
		Node ptr = top;
		for(int i = 0; i < pos - 1 && ptr != null; i++){
			ptr = ptr.next;
		}
		return (ptr != null)?ptr.data:-1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node top = null; //This means Linked list is empty as top is pointing to null 
		top = push(top, 78);
		top = push(top, 7);
		top = push(top, 8);
		//top = pop(top);

		traversal(top);
		/*Stack<Integer> stack = new Stack<Integer>();
		stack.push(2);
		stack.push(3);
		int ele = stack.pop();
		System.out.println("Element : "+ele);
*/
	}

}
