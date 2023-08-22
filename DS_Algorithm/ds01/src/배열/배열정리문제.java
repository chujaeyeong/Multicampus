package 배열;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 배열정리문제 {

	public static void main(String[] args) {
		// 1.
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[5];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		sc.close();// stream close

		int min = numbers[0];

		for (int x : numbers) {
			if (x < min)
				min = x;
		} // for
		System.out.println("1. 최소값은 " + min);
		System.out.println("=================");

		// 2.
		Random r = new Random(100);

		int[] numbers2 = new int[20];
		// numbers = {0,0,0,0,0,0...}
		for (int i = 0; i < numbers2.length; i++) {
			numbers2[i] = r.nextInt(900);
			// 0~100까지만 쓰자
		}

		int max = numbers[0];

		for (int x : numbers2) {
			if (x > max)
				max = x;
		} // for
		System.out.println("2. 최대값은 " + max);
		System.out.println("=================");

		// 3.
		String s1 = "참좋다";
		String s2 = "진짜좋다";

		System.out.println(s1.equals(s2));
		
		int n1 = s1.length();
		int n2 = s2.length();
		if (n1 > n2) {
			System.out.println("s1이 더 크다.");
		} else {
			System.out.println("s2가 더 크다.");
		}
		System.out.println("=================");
		
		// 4.
		String s3 = "나는 진짜 java programmer가 되었어";
		String result = s3.substring(6, 11);
		System.out.println(result);
		System.out.println(result.toUpperCase());
		System.out.println("=================");
		
		// 5.
		String s4 = "2056521";
		char result2 = s4.charAt(0);
		if (result2 == '1') {
			System.out.println("남자임.");
		} else {
			System.out.println("여자임.");
		}
	}

}
