package 조건문;

import java.util.Scanner;

import javax.sound.sampled.Line;

public class 콘솔연습 {

	public static void main(String[] args) {
		// Scanner
		
		// 1. 
		Scanner sc = new Scanner(System.in); // 컴퓨터.키보드 
		
		System.out.println("나에 대한 정보");
		System.out.println("--------------");
		System.out.print("이름 입력 >> ");
		String name = sc.next(); // 한 단어 홍길동 
		System.out.print("나이 입력 >> ");
		int age = sc.nextInt();
		System.out.print("키 입력 >> ");
		double height = sc.nextDouble();
		System.out.print("저녁을 먹었나요 (true / false) >> ");
		boolean dinner = sc.nextBoolean();
		System.out.print("올해의 목표는? ");
		sc.nextLine();
		String life = sc.nextLine();
		
		System.out.println("--------------");
		
		System.out.println("나의 이름은 " + name);
		System.out.println("나의 내년 나이는 " + (age + 1) + "세 입니다. ");
		System.out.println("나의 내년 키는 " + (height + 10) + "cm 입니다. ");
		if (dinner == true) {
			System.out.println("배부르시겠군용 ");
		} else {
			System.out.println("배고프시겠군용 ");
		}
		
		System.out.println("올해의 목표는 " + life + " 입니다. ");
		

		sc.close();
		
		
		
//		// 2.
//		Scanner sc = new Scanner(System.in); // 컴퓨터.키보드
//
//		System.out.print("나의 이름은? ");
//		String name = sc.next();
//		
//		System.out.print("나의 키는? ");
//		double height = sc.nextDouble();
//		
//		System.out.print("나의 몸무게? ");
//		double weight = sc.nextDouble();
//		
//		System.out.print("나는 저녁은 먹었나요? ");
//		boolean dinner = sc.nextBoolean();
//		
//		
//		System.out.println("--------------");
//
//		System.out.println("나의 이름은 " + name + " 입니다. ");
//		System.out.println("내 키는 " + height + " 입니다. ");
//		System.out.println("나의 몸무게는 " + weight + " 입니다. ");
//		System.out.println("나는 저녁을 " + dinner + " 했습니다. ");

//		
//
//		sc.close();

	}

}
