package 스택;

import java.util.Stack;

public class 올바른괄호문제 {

	public static void main(String[] args) {
//		String s = "()()";
		String s = ")()((";
		boolean answer = false;
		
		Stack<Character> stack = new Stack<>();
		try {
			for (int i = 0; i < s.length(); i++) {
				//			System.out.println(s.charAt(i));
				if (s.charAt(i) == '(') {
					stack.push('(');
				} else {
					stack.pop();
				}
			}
			answer = stack.empty();
		} catch (Exception e) {
			answer = false;
		}
		System.out.println(stack);
		System.out.println(answer);
	}

}
