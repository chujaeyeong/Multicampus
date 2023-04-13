package 컬렉션;

public class 편지문제 {

	public static void main(String[] args) {
		String message = "할머니 사랑해요!!!";
		Solution9 sol = new Solution9();
		int answer = sol.solution(message);
		System.out.println(answer);
	}
}

class Solution9 {
	public int solution(String message) {
		return message.length() * 2;
	}
}