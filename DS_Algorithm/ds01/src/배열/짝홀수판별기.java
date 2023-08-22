package 배열;

public class 짝홀수판별기 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				sum = sum - i; // -1, -1, -1...
			} else {
				sum = sum + i; // 2, 3
			} // else
		} // for
		
		System.out.println(sum);
	}

}
