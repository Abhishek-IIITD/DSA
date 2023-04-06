
public class StackUsingArray {
	static class Stack{
		int size;
		int arr[];
		int top;
		Stack(int size){
			this.size = size;
			arr = new int[size];
			top = -1; //stack is empty (top index is -1)
		}
	}
	
	static boolean isEmpty(Stack stack){
		/*if(stack.top == -1){
			return true;
		}
		return false;*/
		return (stack.top == -1)?true:false;
	}
	
	static boolean isFull(Stack stack){
		if(stack.top == stack.size - 1){
			return true;
		}
		return false;
	}
	
	static void push(Stack stack, int val){
		if(isFull(stack)){
			System.out.println("Stack overflow");
		}else{
		stack.top++;
		stack.arr[stack.top] = val;
		}
		}

	static int pop(Stack stack){
		if(isEmpty(stack)){
			System.out.println("Stack underflow");
			return -1;
		}else{
		int val = stack.arr[stack.top]; 
		stack.top--;	
		return val;
		}
		
		}
	
	static int peek(Stack stack, int i){
		if(isEmpty(stack)){
			System.out.println("Stack underflow");
			return -1;
		}else{
			int arrayIndex = stack.top - i + 1;
			if(arrayIndex < 0){
				System.out.println("Not a valid position for the stack\n");
				return -1;
			}else{
				return stack.arr[arrayIndex];
			}
		}
	}
	
	static int stackTop(Stack stack){
		if(isEmpty(stack)){
			System.out.println("Stack underflow");
			return -1;
		}else{
			return stack.arr[stack.top];
		}
	}

	static int stackBottom(Stack stack){
		if(isEmpty(stack)){
			System.out.println("Stack underflow");
			return -1;
		}else{
			return stack.arr[0];
		}
	}		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack(4);
		push(stack, 1);
		push(stack, 2);
		push(stack, 3);
		push(stack, 4);
		if(isEmpty(stack)){
			System.out.println("Stack is empty");
		}
		else{
			System.out.println("Stack is not empty");				
		}
		//int element = pop(stack);
		//System.out.println("Popped Element :"+element);
		int element = peek(stack,3);
		System.out.println("Peek Element :"+element);
		
	}

}
