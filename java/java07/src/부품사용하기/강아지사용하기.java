package 부품사용하기;

import 부품만들기.강아지;

public class 강아지사용하기 {

	public static void main(String[] args) {
		강아지 d1 = new 강아지();
		d1.cute = "정말귀여워~";
		d1.pretty = "정말예뻐~";
		d1.size = 20;
		d1.밥을먹다();
		
		강아지 d2 = new 강아지();
		d2.cute = "진짜귀여워!";
		d2.pretty = "진짜예뻐!";
		d2.size = 15;
		
		
		
		System.out.println("강아지는 진짜 " + d1.cute);
		System.out.println("강아지는 정말로 " + d2.pretty);
		System.out.println("우리집 강아지는 " + d1.size + "kg");

	}

}
