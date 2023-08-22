package 배열;

import java.util.Scanner;

public class 입력해서배열넣기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 자바프로그램과 콘솔(키보드)를 스트림(강물)을 open
		int[] numbers = new int[3];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt(); 
			// 콘솔에서 입력받아서 int로 바꾼후, 배열에 넣어라! 
		}
		sc.close(); // stream close
		for (int x : numbers) {
			System.out.println(x);
		}

	}

}
