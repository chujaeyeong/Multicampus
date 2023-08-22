package 배열;

public class 배열기초확인문제 {

	public static void main(String[] args) {
		
		// 
		int[] test1 = new int[5];
		System.out.println("test1의 배열 크기는 " + test1.length);
		
		test1[0] = 100;
		System.out.println("test1의 첫번째 위치의 값은 " + test1[0]);
		
		test1[4] = 500;
		System.out.println("test1의 마지막 위치의 값은 " + test1[4]);
		
		test1[2] = 200;
		System.out.println("test1의 세번째 위치의 값은 " + test1[2]);
		
		for (int i = 0; i < test1.length; i++) {
			System.out.print(test1[i] + " ");
		}
		System.out.println(" ");
		
		for (int i = 0; i < test1.length; i++) {
			System.out.print(i + ": " + test1[i] + " ");
		}
		
		
		
	}

}
