package 문자열;

public class 문자열포함인덱스테스트 {

	public static void main(String[] args) {
		String s = "aaabbccdda";
		System.out.println(s.contains("a")); // a가 있나요? t/f
		System.out.println(s.contains("aaa"));
		System.out.println(s.contains("bc"));
		
		System.out.println(s.indexOf("a")); // a의 첫번째 위치 
		System.out.println(s.lastIndexOf("a")); // a의 마지막 위치 
		System.out.println(s.lastIndexOf("a", 3)); // 0~2
		System.out.println(s.lastIndexOf("a", 8)); // 0~7
		// 없는 것의 인덱스를 찾을 때는 -1이 리턴된다! 
		System.out.println(s.indexOf("f"));
	}

}
