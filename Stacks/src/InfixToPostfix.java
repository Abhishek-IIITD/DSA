import java.util.Stack;


public class InfixToPostfix {

	static boolean isOperator(char ch){
		if(ch == '+' || ch == '-' || ch == '/' || ch == '*')
			return true;
		return false;	
	}
	static int prec(char ch){
		if(ch == '/' || ch == '*'){
			return 2;
		}
		else if(ch == '+' || ch == '-'){
			return 1;
		}
		return 0;
	}
	static String infixToPostfix(String infixString){
		char[] infix = infixString.toCharArray();
		String postfix = "";
		Stack<Character> stack = new Stack<Character>();
		int i = 0;
		while(i < infix.length){
			if(!isOperator(infix[i])){
				postfix += infix[i];
				i++;
			}
			else{
				if(stack.isEmpty()){
					stack.push(infix[i]);
					i++;
				}
				else{
				if(prec(infix[i]) > prec(stack.peek())){
					stack.push(infix[i]);
					i++;
				}
				else{
					postfix += stack.pop();
					}
				}				
			}							
		}
		while(!stack.isEmpty()){
			postfix += stack.pop();
		}
		return postfix;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String infixString = "x-y/z-k*d";
		String postfix = infixToPostfix(infixString);
		System.out.println(""+postfix);
	}

}
