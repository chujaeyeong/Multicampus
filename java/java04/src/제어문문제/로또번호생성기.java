package 제어문문제;

import java.util.Random;

public class 로또번호생성기 {

	public static void main(String[] args) {
		// 아무값이나 발생시키는 부품 ==> 랜덤 
		// 가짜 랜덤한 만들어주는 부품. 
		Random r = new Random(10); // 씨앗값, seed값 
		for (int i = 0; i < 6; i++) {
			System.out.println("로또번호 : " + r.nextInt(10)); // 0~9까지 랜덤 
		}

	}

}
