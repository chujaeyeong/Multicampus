package 배열심화;

public class 깊은복사응용 {

	public static void main(String[] args) {
		String[] 과목명 = { "국어", "영어", "수학", "컴퓨터", "회화" };
		int[] 학기1성적 = { 44, 66, 22, 99, 100 };
		int[] 학기2성적 = 학기1성적.clone();
		System.out.println(학기1성적 == 학기2성적); // 주소비교
		학기2성적[0] = 22;
		학기2성적[2] = 88;

		for (int i = 0; i < 학기2성적.length; i++) {
			System.out.print(학기1성적[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < 학기2성적.length; i++) {
			System.out.print(학기2성적[i] + " ");
		}
		
		int count1 = 0;
		int count2 = 0; // 1학기가 더 높은거 
		int count3 = 0; // 2학기가 더 높은거 
		
		for (int i = 0; i < 학기2성적.length; i++) {
			if (학기1성적[i] == 학기2성적[i]) {
				count1++;
			} else if (학기1성적[i] > 학기2성적[i]) {
				count2++;
				System.out.println("\n성적이 하락한 과목은 " + 과목명[i]);
			} else {
				count3++;
				System.out.println("\n성적이 오른 과목은 " + 과목명[i]);
			}
		}
		System.out.println("성적이 동일한 과목 수는 " + count1 + "개 입니다. ");
		System.out.println("성적이 하락한 과목 수는 " + count2 + "개 입니다. ");
		System.out.println("성적이 상승한 과목 수는 " + count3 + "입개 니다. ");

	}

}
