package 프로그래머스기본;

public class 각도기 {

	public static void main(String[] args) {
		int angle = 70;
		Solution sol = new Solution();
		int answer = sol.solution(angle);
		System.out.println(answer);

	}
}

class Solution {
	public int solution(int angle) {
		int answer = 0;

		if (0 < angle && angle < 90) {
			answer = 1;
		} else if (angle == 90) {
			answer = 2;
		} else if (90 < angle && angle < 180) {
			answer = 3;
		} else {
			answer = 4;
		}

		return answer;
	}
}
