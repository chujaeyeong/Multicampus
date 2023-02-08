package 반복문;

import java.util.Iterator;

public class Fo3 {

	public static void main(String[] args) {
		// 1.
		for (int i = 0; i < 10; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		// 2.
		for (int i = 0; i < 5; i++) {
			System.out.print("커피*");
		}
		System.out.println();
		
		// 3.
		for (int i = 0; i < 3; i++) {
			System.out.println("커피*우유");
		}
		System.out.println();
		
		// 4.
		for (int i = 0; i < 3; i++) {
			System.out.println((i + 1) + " : 짱!"); 
			// 앞에서부터 연산이 되니 소괄호는 굳이 안 넣어줘도 된당 
			// 근데 헷갈리니까 명확하게 하는걸 더 선호한당 
		}
	}

}
