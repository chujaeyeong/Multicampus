package 배열;

import java.util.Random;

public class 배열최대값구하기2 {

	public static void main(String[] args) {
		Random r = new Random(99);
		int[] s = new int[1000];
		
		for (int i = 0; i < s.length; i++) {
			s[i] = r.nextInt(1000); // 0~999
		}
		
		int max = s[0];
		
		for (int x : s) {
			if (x > max) {
				max = x;
			} // if
		} // for
		
		System.out.println("최대값은 " + max);
	}

}
