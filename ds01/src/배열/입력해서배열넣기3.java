package 배열;

import java.util.Scanner;

public class 입력해서배열넣기3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[3]; //{0,0,0} ==> {11, 33, 22}
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		sc.close();//stream close
		for (int x : numbers) {
			System.out.println(x);
		}
		int count = 0; //33이 몇 개인지프린트! 해보자.
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] == 33) {
				count++;
			}
		}
		System.out.println("33의 개수는 " + count);
		
	}

}