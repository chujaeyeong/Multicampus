package 컬렉션2;

import java.util.Arrays;

public class K번째큰수 {

	public static void main(String[] args) {
		int[] num = {3, 4, 5, 1, 2};
		int k = 2; // 2번째 큰 수 
		// 일단 정렬하고, 정렬한 데이터에서 2번째 위치를 찾을 것 
		Arrays.sort(num); // 원본을 정렬해서 다시 저장 
		for (int x : num) {
			System.out.println(x + " ");
		}
		
		System.out.println();
		
		String num2 = Arrays.toString(num);
		System.out.println(num2);
		
		System.out.println("제일 큰 수는 " + num[num.length - 1]);
		// 첫번째 큰 수 => num.length - 1
		// 두번째 큰 수 => num.length - 2 
		System.out.println("두번째 큰 수는 " + num[num.length - 2]);
		System.out.println("세번째 큰 수는 " + num[num.length - 3]);
		System.out.println(k + "번째 큰 수는 " + num[num.length - k]);

	}

}
