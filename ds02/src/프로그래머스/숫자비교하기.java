package 프로그래머스;

import java.util.Scanner;

public class 숫자비교하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		Solution4 sol = new Solution4();
		int answer = sol.solution(num1, num2); // int 
		System.out.println(answer);
		sc.close();
	}

}

class Solution4 {
    public int solution(int num1, int num2) {
        int answer = 0;
    	
    	if (num1 == num2) {
			answer = 1;
		} else {
			answer = -1;
		}
        
    	return answer;
        
        
    }
}
