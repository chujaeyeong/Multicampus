package 스택;

import java.util.Stack;

public class 스택_주요함수 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		// 선입후출 (FILO)
		stack.add("홍길동");
		stack.add("김길동");
		stack.add("송길동");
		stack.add("정길동");
		System.out.println(stack);
		System.out.println(stack.get(0));
		System.out.println(stack.get(1));
		System.out.println(stack.get(2));
		System.out.println(stack.get(3)); // 먼저 들어온 애가 0번부터 차례대로 들어감 
		System.out.println(stack.pop());
		System.out.println(stack); // 맨 나중에 push된 정길동이 pop됨. 
		System.out.println(stack.get(0));
		System.out.println(stack.get(1));
		System.out.println(stack.get(2));
		System.out.println(stack.empty());
		System.out.println(stack.contains("홍길동"));
		System.out.println(stack.peek());
		
	}

}
