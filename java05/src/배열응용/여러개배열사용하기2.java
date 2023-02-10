package 배열응용;

public class 여러개배열사용하기2 {

	public static void main(String[] args) {

		String[] names = { "홍길동", "이순신", "뉴진스", "방탄", "블랙핑크" };
		int[] term1 = { 77, 88, 99, 55, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };
		
		int count = 0; // 1학기 성적 
		int count2 = 0; // 2학기 성적 
		int count3 = 0; // 성적 동일 
		int avg = 0;
		
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				count2++; // 2학기 성적 오른사람 
			} else if (term1[i] == term2[i]) {
				count3++; // 성적 똑같은 사람 
			} else {
				count++; // 2학기 성적 떨어진 사람 
			}
		} // for
		
		System.out.println("2학기 성적이 오른 학생은 >> " + count2 + "명");
		System.out.println("성적이 똑같은 학생은 >> " + count3 + "명");
		System.out.println("2학기 성적이 떨어진 학생은 >> " + count + "명");
		
		for (int i = 0; i < term2.length; i++) {
			if (term2[i] == 100) {
				System.out.println("2학기 성적이 100점인 학생은 " + names[i]);
			}
		} // for
		
		
		int sumTerm1 = 0;
		int sumTerm2 = 0;		
		
		for (int i = 0; i < term2.length; i++) {
			sumTerm1 = sumTerm1 + term1[i];
			sumTerm2 = sumTerm2 + term2[i];
		}
		
		double avgTerm1 = (double)sumTerm1 / term1.length;
		double avgTerm2 = (double)sumTerm2 / term2.length;
		
		if (avgTerm1 > avgTerm2) {
			System.out.println("1학기 성적이 더 높았습니다. ");
		} else if (avgTerm1 < avgTerm2) {
			System.out.println("2학기 성적이 더 높았습니다. ");
		} else {
			System.out.println("1학기 성적과 2학기 성적평균이 동일합니다. ");
		}
		
		for (int i = 0; i < term2.length; i++) {
			if (names[i].equals("뉴진스")) {
				System.out.println("뉴진스의 위치는 " + i);
				System.out.println("뉴진스의 1학기 성적은 " + term1[i] + ", 뉴진스의 2학기 성적은 " + term2[i]);
			}
		}

	}

}