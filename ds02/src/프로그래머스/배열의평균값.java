package 프로그래머스;

import java.util.Scanner;

public class 배열의평균값 {

	public static void main(String[] args) {

		Solution5 sol = new Solution5();
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		double answer = sol.solution(numbers); // int[]
		System.out.println(answer);
	}

}

class Solution5 {
	public double solution(int[] numbers) {
//		System.out.println(numbers.length); // 10개 
		int size = numbers.length;
		// {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
		int sum = 0;
		for (int x : numbers) {
			sum = sum + x;
		}
//		System.out.println((double)sum / size);
        double answer = (double)sum / size;
        return answer;
    }
}
