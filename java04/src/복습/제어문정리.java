package 복습;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 제어문정리 {

	public static void main(String[] args) {
//		 Scanner

//		// 1. OK
//		Scanner sc = new Scanner(System.in); // 컴퓨터.키보드
//
//		System.out.print("id를 입력하세요 >> ");
//		String id = sc.next();
//		System.out.print("pw를 입력하세요 >> ");
//		String pw = sc.next();
//
//		if (id.equals("root") && pw.equals("1234")) {
//			JOptionPane.showMessageDialog(null, "로그인성공! ");
//		} else {
//			JOptionPane.showMessageDialog(null, "로그인실패! ");
//		}
//
//		sc.close();

//		// 2. OK
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("사과 한 개당 가격을 입력하세요. >> ");
//		int apple1 = sc.nextInt();
//		System.out.print("사과 구매 갯수를 알려주세요. >> ");
//		int apple2 = sc.nextInt();
//		
//		System.out.print("딸기 한 개당 가격을 입력하세요. >> ");
//		int st1 = sc.nextInt();
//		System.out.print("딸기 구매 갯수를 알려주세요. >> ");
//		int st2 = sc.nextInt();
//		
//		int total = (apple1 * apple2) + (st1 * st2);
//		
//		System.out.println("=============================");
//		
//		System.out.println("사과 구매 가격은 " + (apple1 * apple2) + "원 입니다. ");
//		System.out.println("딸기 구매 가격은 " + (st1 * st2) + "원 입니다. ");
//		System.out.println("전체 구매 가격은 " + total + "원 입니다. ");
//		
//		sc.close();
//		
//		
//		// 3. OK 
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("시작값을 입력하세요 (정수) >> ");
//		int num1 = sc.nextInt();
//		System.out.print("종료값을 입력하세요 (정수) >> ");
//		int num2 = sc.nextInt();
//
//		int sum = 0;
//		for (int i = num1; i <= num2; i++) {
//			sum = sum + i;
//		}
//		System.out.println("전체 합은 >> " + sum);1
//
//		sc.close();

		// 4. 모르겠더요 ㅠㅠㅠ 풀어보자꾸나 ~~~ 해결완 
		Scanner sc = new Scanner(System.in);

		System.out.print("시작값을 입력하세요 (정수) >> ");
		int num1 = sc.nextInt();
		System.out.print("종료값을 입력하세요 (정수) >> ");
		int num2 = sc.nextInt();
		System.out.print("점프값을 입력하세요 (정수) >> ");
		int num3 = sc.nextInt();

		int sum = 0;
		for (int i = num1; i <= num2; i = i + num3) {
			sum = sum + i;
			if (sum >= 100) {
				System.exit(0);
			}
		}
		System.out.println("전체 합은 >> " + sum);

		sc.close();

	}

}
