package 배열응용;

import java.util.Scanner;

public class 입력받아배열에넣기확인문제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String travel1[] = new String[3];
		String travel2[] = new String[3];

		for (int i = 0; i < travel1.length; i++) {
			System.out.print("작년에 가고싶었던 여행지 세 곳을 입력하세요. >> ");
			travel1[i] = sc.next();
		}
		for (int i = 0; i < travel2.length; i++) {
			System.out.print("올해 가고싶은 여행지 세 곳을 입력하세요. >> ");
			travel2[i] = sc.next();
		}
		
		
//		아직 못풀었어용 
//		if (travel1[i] == travel2[i]) {
//			System.out.println("가고싶은 여행지가 같습니다. ");
//		} else {
//			System.out.println("가고싶은 여행지가 다릅니다. ");
//		}

		sc.close();

	}

}
