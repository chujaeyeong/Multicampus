package 변수;

public class 변수선언 {

	public static void main(String[] args) {
		// 자바는 변수를 만들 때, 어떤 타입의 데이터를 만들지 결정하고 들어간다.
		// 선언 !! 타입 변수명 !! ==> 변수가 램에 생성된다~ 
		// 기본 데이터 => 정수, 실수, 문자1글자, 논리 
		int num = 100; // int는 정수 변수! 
		double num2 = 22.2; // double은 실수 변수! (정수도 넣을 수 있단다 )
		char c = '한'; // 글자 1글자 쓸 때 char (캐릭터, 쓸 때 무조건 싱글 따옴표 )
		boolean b = true; // false나 true
		num = 200; //OK!!!
		// 변수명은 중복 안됨~ 
		
		System.out.println("정수값은 " + num);
		
		
		

	}

}
