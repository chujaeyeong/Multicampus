package 제어문문제;

import java.util.Random;
import java.util.Scanner;

public class 숫자맞추기 {

	public static void main(String[] args) {
//		int target = 77;
		
		Random r = new Random();
		int target = r.nextInt(100);
		
		Scanner sc = new Scanner(System.in);
		
		int data = 0;
		int count = 0;
		while (true) {
			System.out.print("생각한 정답은 ??? ");
			data = sc.nextInt();
			count++;
			if (data == target) {
				System.out.println("정답입니다!");
				System.out.println("당신의 시도 횟수는 " + count);
				System.out.println("프로그램을 종료합니다. ");
				break;
			} else if (data > target) {
				System.out.println("오답입니다!");
				System.out.println("값이 너무 커요 ");
				
			} else if (data < target) {
				System.out.println("오답입니다!");
				System.out.println("값이 너무 작아요. ");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
