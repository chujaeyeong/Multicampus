package 프로그래머스;

import java.util.Scanner;

public class 배열의평균값2 {

	public static void main(String[] args) {

		Solution6 sol = new Solution6();
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int answer = sol.solution(numbers); // int[]
		System.out.println(answer);
	}

}

class Solution6 {
	public int solution(int[] numbers) {
		
        int answer = numbers[numbers.length - 3] + numbers[numbers.length - 2] + numbers[numbers.length - 1];
        return answer;
    }
}
