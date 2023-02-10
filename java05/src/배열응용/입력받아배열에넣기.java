package 배열응용;

import java.util.Scanner;

public class 입력받아배열에넣기 {

	public static void main(String[] args) {
		// 1. 
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			System.out.print("숫자를 입력하세요 >> ");
			num[i] = sc.nextInt();
		}
		
		System.out.println("첫번째값과 세번째 값을 더하면? " + num[0] + num[2]);
		
		sc.close();
		
//		// 2.
//		Scanner sc = new Scanner(System.in);
//		String[] text = new String[3];
//		
//		for (int i = 0; i < text.length; i++) {
//			System.out.print("배우고 있는 언어 입력하세요 >> ");
//			text[i] = sc.next();
//		}
//		
//		System.out.println(text[0] + " 보다는 " + text[2]);
//		
//		
//		sc.close();
//		
		
		
		

		
		
	}

}
