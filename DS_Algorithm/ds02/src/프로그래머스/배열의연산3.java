package 프로그래머스;

import java.util.Arrays;
import java.util.Scanner;

public class 배열의연산3 {

	public static void main(String[] args) {
		
		Solution7 sol = new Solution7();
		int[] numbers = {4, 3, 2, 7, 5, 10, 8, 9};
		
		int answer = sol.solution(numbers); // int[]
		System.out.println(answer);
	}

}

class Solution7 {
	public int solution(int[] numbers) {
		Arrays.sort(numbers); // 파괴형 함수 
		
		int answer = numbers[numbers.length - 2] * numbers[numbers.length - 1];
		
        return answer;
    }
}
