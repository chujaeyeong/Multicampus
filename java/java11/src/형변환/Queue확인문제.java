package 형변환;

import java.util.LinkedList;

public class Queue확인문제 {

	public static void main(String[] args) {
		LinkedList test = new LinkedList();
		
		test.add("국어");
		test.add("수학");
		test.add("영어");
		test.add("컴퓨터");
		System.out.println("전체 시험볼 과목 : " + test);
		
		test.remove(); // 국어 
		System.out.println(test);
		test.remove(); // 수학 
		System.out.println(test);
		test.remove(); // 영어 
		System.out.println(test);
		
		for (int i = 0; i <= test.size(); i++) {
			test.remove();
			System.out.println((i + 1) + "일차 남은 과목 : " + test);
		}

	}

}
