package 프로그래머스;

import java.util.Scanner;

public class 나머지구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		Solution3 sol = new Solution3();
		int answer = sol.solution(num1, num2); // int 
		System.out.println(answer);
		sc.close();
	}

}

class Solution3 {
    public int solution(int num1, int num2) {
        int answer = num1 % num2;
        
        return answer;
        
        
        
    }
}
