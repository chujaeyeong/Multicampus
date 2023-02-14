package 배열복습;

public class 이차원배열프린트2 {

	public static void main(String[] args) {
		// 꼭 하고싶은 것 9가지를 작성해서, 전체 프린트 
		String[][] s = {
				{"마라탕먹기", "마라샹궈먹기", "꿔바로우먹기"},
				{"치킨먹기", "피자먹기", "햄버거먹기"},
				{"라멘먹기", "규동먹기", "돈까스먹기"}
		};
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				System.out.println(s[i][j]);
			}
		}
	}

}
