import java.util.Stack;


public class MultipleParenthesisMatch {

	static boolean multipleParenthesisMatch(String str){
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{'){
				stack.push(str.charAt(i));
			}
			
			switch(str.charAt(i)){
			case ')':
				if(!stack.isEmpty() && stack.peek() == '('){
					stack.pop();
					break;
				}
				return false;
			case ']':
				if(!stack.isEmpty() && stack.peek() == '['){
					stack.pop();
					break;
				}
				return false;
			case '}':
					if(!stack.isEmpty() && stack.peek() == '{'){
						stack.pop();
						break;
					}
					return false;
			}			
		}
		if(stack.isEmpty())
			return true;
	
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "[4-6]((8){(9-8)})";
		System.out.println("Result :"+multipleParenthesisMatch(s));

	}

}
