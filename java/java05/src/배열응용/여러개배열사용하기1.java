package 배열응용;

public class 여러개배열사용하기1 {

	public static void main(String[] args) {

		String[] 식구 = { "아빠", "엄마", "형", "나" };
		int[] age = { 100, 50, 30, 25 };
		double[] height = { 175.5, 150.5, 180.5, 165.5 };
		
		System.out.println("이름\t나이\t키");
		System.out.println("========================");
		for (int i = 0; i < height.length; i++) {
			System.out.println(식구[i] + "\t" + age[i] + "\t" + height[i]);
		}
	}

}
