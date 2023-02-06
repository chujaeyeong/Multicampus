package 변수;

public class 변수선언확인문제 {

	public static void main(String[] args) {
		// 정수 (integer)
		int age = 28;
		
		// 실수 
		double eye = 0.1;
		
		// 문자1
		char gender = '여';
		
		// 논리
		boolean food = true;
		
		// 기본데이터 X ==> 너무 많이 쓰기 때문에 기본형처럼 기본형데이터처럼 사용 가능하당
		String name = "홍길동"; // 스트링 S는 무조건 대문자, 따옴표는 쌍따옴표!! 
		
		System.out.println("내 나이는 " + age);
		System.out.println("내 시력은 " + eye);
		System.out.println("내 성별은 " + gender);
		System.out.println("아침밥은 " + food);
		System.out.println("내 이름은 " + name);

	}

}
