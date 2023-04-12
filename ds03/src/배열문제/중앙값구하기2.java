package 배열문제;

import java.util.*;

public class 중앙값구하기2 {

	public static void main(String[] args) {
		int[] s = { 5, 2, 1, 9, 11, 15, 17, 21 };
		// 배열에 들어간 하나의 값:element,엘리먼트, 요소
		// 짝수개인 경우, 중앙에 있는
		// 2개의 값을 더해서 프린트!
		String s2 = Arrays.toString(s);
		System.out.println(s2);
		
		Arrays.sort(s); //파괴! 
		System.out.println(Arrays.toString(s));
		
		//2. 중앙위치를 구하자 
		//   0, 1, 2, 3, 4
		int center1 = s.length / 2;
		int center2 = s.length / 2 - 1;
		
		//3. 배열의 중앙위치값을 get!
		int answer = s[center1] + s[center2];
		
		System.out.println(answer);
	}

}