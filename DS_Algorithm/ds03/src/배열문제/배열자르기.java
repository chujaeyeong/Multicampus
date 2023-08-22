package 배열문제;

import java.util.*;

public class 배열자르기 {

	public static void main(String[] args) {
		int[] numbers = { 1, 3, 5 };
		int num1 = 1;
		int num2 = 2;

		Solution6 sol = new Solution6();
		int[] answer = sol.solution(numbers, num1, num2);
		System.out.println(Arrays.toString(answer));
	}
}

class Solution6 {
    public int[] solution(int[] numbers, int num1, int num2) {
        int size = num2 - num1 + 1; // 3
    	int[] answer = new int[size];
    	for (int i = 0; i < size; i++) {
			answer[i] = numbers[num1];
			// answer[0] = numbers[1];
			// answer[1] = numbers[2];
			// answer[2] = numbers[3];
			// i가 3이니까 answer[2]가 끝 
			num1++;
		}
        return answer;
    }
}