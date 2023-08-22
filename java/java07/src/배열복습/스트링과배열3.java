package 배열복습;

public class 스트링과배열3 {

	public static void main(String[] args) {
		String s = "  010-245-1234   "; // 공백 2칸 
		String s2 = s.trim();
		System.out.println(s2.length()); // 12
		
		String[] s3 = s2.split("-"); // {"010", "245", "1234"}
		System.out.println(s3[0]);
		System.out.println(s3[1]);
		System.out.println(s3[2]);
		
		if (s3[0].equals("011")) {
			System.out.println("SK");
		} else if (s3.equals("019")) {
			System.out.println("LG");
		} else {
			System.out.println("APPLE");
		}
		
		if(s3[1].length() >= 4) {
			System.out.println("최신폰입니다");
		} else {
			System.out.println("올드폰입니다");
		}
		
		int total = s3[0].length() + s3[1].length() + s3[2].length();
		System.out.println(total);
		
		if (total >= 10) {
			System.out.println("유효한 전화번호");
		} else {
			System.out.println("유효하지 않은 전화번호");
		}
		
		int total2 = 0;
		for (int i = 0; i < s3.length; i++) {
			total2 = total2 + s3[i].length();
		}
		System.out.println(total2);
		
		System.out.println(s2);
		String s222 = s2.replace("-", "");
		System.out.println(s222);
		
	}

}
