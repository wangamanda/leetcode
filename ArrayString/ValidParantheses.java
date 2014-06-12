import java.util.Stack;

public class ValidParantheses{
	public static void main(String[] args){
		boolean res = isValid(args[0]);
		System.out.println(Boolean.valueOf(res));
	}

	public static boolean isValid(String s){
		Stack<Character> stack = new Stack<Character>();
		Character c;
		for(int i = 0 ; i < s.length(); i ++ ){
			c = s.charAt(i);
			String t = Character.toString(c);
			if(t.equals("(") || t.equals("[") || t.equals("{")){
				stack.push(c);
				System.out.println(stack.size()+"");
			}else{
				if((t.equals(")") && stack.isEmpty())
				||(t.equals("]") && stack.isEmpty())
				||(t.equals("}") && stack.isEmpty())){
					return false;
				}

				if((t.equals(")") && stack.peek().equals("("))
				||(t.equals("]") && stack.peek().equals("["))
				||(t.equals("}") && stack.peek().equals("{"))){
					stack.pop();
					System.out.println("pop");
				}
			}
		}

		if(stack.isEmpty()){
			return true;
		}else{
			return false;
		}
	}
}
