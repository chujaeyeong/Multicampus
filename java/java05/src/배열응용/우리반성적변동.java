package 배열응용;

import java.util.Random;

public class 우리반성적변동 {

	public static void main(String[] args) {
		Random r = new Random(42);

		int[] n1 = new int[10000];
		int[] n2 = new int[10000];

		for (int i = 0; i < n2.length; i++) {
			n1[i] = r.nextInt(101);
			n2[i] = r.nextInt(101);
		}

		int count = 0; // 동일한 갯수 누적
		int count2 = 0; // 동일하지 않은 갯수 누적
		int count3 = 0; // 2학기 성적이 더 큰 경우 
		int count4 = 0; // 1학기 성적이 더 큰 경우 

		for (int i = 0; i < n2.length; i++) {
			System.out.println(n1[i] == n2[i]);
			if (n1[i] == n2[i]) {
				count++;
			} else { // 다른경우 !!
				count2++;
				// 크면 카운트 
				// 크지않으면 카운트 
				if (n1[i] < n2[i]) {
					count3++;
				} else {
					count4++;
				} 
			}
		} // for
		
		System.out.println("1-2학기 성적이 동일한 학생수>> " + count + "명");
		System.out.println("1-2학기 성적이 동일하지 않은 학생수>> " + count2 + "명");
		System.out.println("2학기 성적이 더 좋은 학생 수 >> " + count3 + "명");
		System.out.println("1학기 성적이 더 좋은 학생 수 >> " + count4 + "명");

	}

}