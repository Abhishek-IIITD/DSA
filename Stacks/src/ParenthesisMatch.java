import java.util.Stack;


public class ParenthesisMatch {

	static boolean parenthesisCheck(String str){
		Stack<Character> stack = new Stack<Character>(); //empty stack
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == '('){
				stack.push(str.charAt(i));
			}else if(str.charAt(i) == ')'){
				if(stack.isEmpty())
					return false;
				stack.pop();
			}
		}
		if(stack.isEmpty())
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "((8)(*--$$9))";
		System.out.println("Result :"+parenthesisCheck(s));
	}

}
