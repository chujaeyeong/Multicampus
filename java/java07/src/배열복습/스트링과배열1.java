package 배열복습;

public class 스트링과배열1 {

	public static void main(String[] args) {
		// 스트링의 일부를 추출, 확인 사용하는 메서드 
		String s1 = "나는 프로그래머프야";
		String s2 = "진짜!!";
		System.out.println(s1 + s2);
		System.out.println(s1.concat(s2)); // 스트링 
		System.out.println(s1.charAt(0));
		char c = s1.charAt(0); // 한 문자만 추출 
		System.out.println(s1.endsWith("야")); // 참거짓 
		boolean result = s1.endsWith("야");
		String result2 = s1.substring(3); // 인덱스 3부터 끝까지 추출 => 프로그래머야 
		String result3 = s1.substring(3, 8); // 인덱스 3부터 7까지 추출 => 프로그래머 
		boolean result4 = s1.contains(s2);
		int index = s1.lastIndexOf("프");
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.length());
		s1 = s1.replace("나", "너"); // 비파괴함수, cpu에서만 변경했기 때문에 앞에 s1 = 을 써줘야 출력값도 바뀜. 
		System.out.println(s1);
		
	}

}
