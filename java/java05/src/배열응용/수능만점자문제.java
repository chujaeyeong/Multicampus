package 배열응용;

import java.util.Random;

public class 수능만점자문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 수능 10000명의 점수를 처리! ==> 배열 필요
		int[] jumsu = new int[10000];
		// jumsu = {0, 0, 0, 0, 0, ......}
		// 주소 jumsu[0] jumsu[1]

		// 랜덤으로 10000명 넣어주세요 ==> 랜덤 필요
		Random r = new Random(42); // 42는 시드값 
		
		
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(451);
			System.out.println(i + " : " + jumsu[i]);
		}
		
		System.out.println("========================");

		// 1) 만점자가 몇 명인지?? 누구인지 (인덱스)
		// 2) 0점이 몇명인지?
		int maxCount = 0;
		int zeroCount = 0;
		for (int x : jumsu) {
			// 점수가 450점과 동일한지 체크해서 true면 카운트 증가
			if (x == 450) {
				maxCount++;
			} // if
			if (x == 0) {
				zeroCount++;
			} // if
		} // for
		
		System.out.println("만점자 : " + maxCount);
		System.out.println("빵점자 : " + zeroCount);
		
	
		// 3) 평균은 어떻게 되었는지 ?? 합계를 먼저 구해야함.
		int sum = 0;
		for (int x : jumsu) {
			sum = sum + x; // sum += x; 랑 똑같음 !
		}
		double avg = (double)sum / jumsu.length;
		System.out.println("전체 수험생의 평균 점수는 : " + avg);
		
		
		// 4) (심화) 평균보다 +-50점인 학생 카운트 (>=)
		int avgPlusMinus = 0;
		
		// 250 <= avg <= 350, avg가 300인 경우 
		for (int x : jumsu) {
			if ((avg-50 <= x) && (x <= avg+50)) {
				avgPlusMinus++;
			} // if
		} // for
		System.out.println("평균 범위에 있는 학생 수는 : " + avgPlusMinus + "명");
		
		
		// 5) 점수 상위 30% 학생을 구하려면 ? 
		// 100의 30%면 30점 ...
		
		
		
//		내가 푼 것 
//		int[] test = new int [10000]; 
//		Random r = new Random(5);
//		
//		for (int i = 0; i < test.length; i++) {
//			test[i] = r.nextInt(451); // 0~450
//		}
//
//		// 전체프린트
//		for (int x : test) {
//			System.out.println(x);
//		}
//		
//		int count = 0;
//		int sum = 0;
//		for (int i = 0; i < test.length; i++) {
//			if (test[i] == 450) {
//				count++; 
//			}
//		} // for
//		System.out.println("450점은 : " + count);
//		
//		
//		for (int i = 0; i < test.length; i++) {
//			if (test[i] == 0) {
//				count++; 
//			}
//		}
//		System.out.println("0점은 : " + count);

	}

}
