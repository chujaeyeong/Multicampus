package 상속;

import java.io.FileWriter;

public class 예외처리3 {

	public static void main(String[] args) {
		// 아래 코드를 문석해보고, 문제가 생길 여지가 있는 코드가 
		// 에러가 발생했을 때 실행을 제외시켜버리고 
		// 프로그램이 중단이 되지 않도록 하기 
		
		int[] num = new int[3];
		try {
			num[3] = 2; // 문제가 생길 여지가 있는 코드!
		} catch (Exception e) {
			System.out.println("이 코드는 문제가 있단다 ");
		}
		
		System.out.println(num.length);
		
	}

}
