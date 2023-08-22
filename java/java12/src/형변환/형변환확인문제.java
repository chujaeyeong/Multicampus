package 형변환;

import java.util.ArrayList;

public class 형변환확인문제 {

	public static void main(String[] args) {
		ArrayList me = new ArrayList();
		me.add(1000); // Object <-업캐스팅- Integer <-오토박싱- int
		me.add(189.1); // Object <- Double <- double
		me.add(false); // Object <- Boolean <- boolean
		me.add('남'); // Object <- Character <- char

		// ArrayList는 toString()가 재정의
		// list라는 참조형이기 때문에 list를 프린트하면 주소!가 프린트
		// toString()이 재정의한 내용은 주소가 가르키는 값들을 String으로 만들어주도록 정의함.
		// list를 찍어보면 주소대신 String으로 만든 내용이 출력

		int money = (int) me.get(0) + 2000;
		System.out.println("내 지갑엔 " + money + "가 있습니다. ");
		//int <-오토언박싱- Integer <-다운캐스팅- Object

		double height = (double) me.get(1) + 10;
		System.out.println("저는 키가 " + height + "cm 입니다. ");
		//double <- Double <- Object

		boolean food = (boolean) me.get(2);
		if (food) { // if(조건) : 조건이 true이면 이라고 자동으로 해석함
			System.out.println("배불러요");
		} else {
			System.out.println("배고파요");
		}
		//boolean <- Boolean <- Object

		char gender = (char) me.get(3);
		if (gender == '남') {
			System.out.println("제 주민번호는 1, 3 입니다. ");
		} else {
			System.out.println("제 주민번호는 2, 3 입니다. ");
		}
		//char <- Character <- Object

	}

}
