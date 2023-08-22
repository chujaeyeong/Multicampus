package 컬렉션2;

import java.util.Arrays;
import java.util.Scanner;

public class K번째큰수2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt(); // 입력할 개수, 5 
		int k = sc.nextInt(); // k번째 큰 수 
		int[] num = new int[size];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(num));
		
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		System.out.println(k + "번째 큰 수 : " + num[num.length - k]);

	}

}
