package 문자열;

public class String에서Char배열옮기기2 {

	public static void main(String[] args) {
		String s = "s205621"; //String도 index를 이용해서 추출가능 
		
		char c1 = s.charAt(3);
		char c2 = s.charAt(4);
		
		String s2 = String.valueOf(c1) + String.valueOf(c2);
		System.out.println(s2);
		
		System.out.println(s.substring(3, 5)); // 시작인덱스, 끝 인덱스+1
		
		char[] result = new char[2];
		s.getChars(3, 5, result, 0);
		System.out.println(result);
		
		// 모든 글자를 String[]로 옮겨보세요.
		// 첫번째 글자와 마지막 글자를 결합시켜 프린트 (s1)
		
		String[] all = s.split("");
		System.out.println(all[0] + all[all.length - 1]);

	}

}
