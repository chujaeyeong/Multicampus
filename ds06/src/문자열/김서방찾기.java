package 문자열;

public class 김서방찾기 {

	public static void main(String[] args) {
		String[] s = {"Jane", "Kim"};
		String answer = "";
		int findIndex = 0;
		// Kim이 어디있는지 위치를 찾아보세요! 
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals("Kim")) {
				findIndex = i;
			}
		}
		
		answer = "김서방은 " + findIndex + "에 있다. ";
		System.out.println(answer);

	}

}
