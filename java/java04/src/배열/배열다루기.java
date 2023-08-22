package 배열;

public class 배열다루기 {

	public static void main(String[] args) {
//		int[] x = new int[10]; // legnth: 10
//		System.out.println(x.length);
//		x[0] = 10;
//		x[1] = 20;
//		
//		// index는 0부터 시작, 마지막 위치의 인덱스는 10보다 작음. 
//		for (int i = 0; i < x.length; i++) {
//			System.out.print(x[i] + " ");
//		}
//		
//		
//		System.out.println(x[0]);
//		System.out.println(x[1]);
//		System.out.println(x[2]);
		
		char[] gender = {'남', '여', '여', '남'};
		for (int i = 0; i < gender.length; i++) {
			System.out.print(gender[i] + " ");
		}
		
		System.out.println(" ");
		
		
		String[] name = {"홍길동", "김영숙", "김영자", "김철수"};
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}
		
		System.out.println(" ");
		
		double[] eye = {1.0, 0.2, 0.1, 0.8};
		for (int i = 0; i < eye.length; i++) {
			System.out.print(eye[i] + " ");
		}
		
		System.out.println(" ");
		
		boolean[] dinner = {true, false, false, true};
		for (int i = 0; i < dinner.length; i++) {
			System.out.print(dinner[i] + " ");
		}
		

	}

}
