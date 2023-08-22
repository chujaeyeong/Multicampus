package 스택;

import java.util.EmptyStackException;
import java.util.Stack;

public class 백준_stack확인 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		System.out.println(stack.peek()); // 맨 위를 print
		System.out.println(stack.size());

		try {
			System.out.println(stack.empty()); // 비었는지 안 비었는지 t/f로 출력
			System.out.println(stack.pop()); // pop될거 출력
			System.out.println(stack.pop()); // pop될거 출력
			System.out.println(stack.pop()); // pop될거 출력 => -1???
		} catch (EmptyStackException e) {
			System.out.println("-1");
		}
		System.out.println(stack.size());
		try {
			System.out.println(stack.pop());
		} catch (EmptyStackException e) {
			System.out.println("-1");
		}
		stack.push(3);
		System.out.println(stack.empty()? 1 : 0); // 삼항연산자 
		System.out.println(stack.peek());

	}

}
