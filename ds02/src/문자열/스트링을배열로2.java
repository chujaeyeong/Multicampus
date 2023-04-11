package 문자열;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class 스트링을배열로2 {

	public static void main(String[] args) {

		String all = "국어, 영어, 수학, 컴퓨터";
		// , 기준으로 배열을 만들자 
		String[] all2 = all.split(",");
		System.out.println(all2.length);
		System.out.println(all2[1]);
		
		// , 뒤에 넣었던 공백을 없애자 
		for (int i = 0; i < all2.length; i++) {
			if (all2[i].contains(" ")) {
				all2[i] = all2[i].trim();
			}
		}
		System.out.println(all2[1]);
		
		System.out.println("과목 수: " + all2.length);
		System.out.println(Arrays.toString(all2)); // 배열 전체를 프린트  
		// 컴퓨터가 몇번째 들어있는지 찾기 
		for (int i = 0; i < all2.length; i++) {
			if (all2[i].equals("컴퓨터")) {
				System.out.println(i);
			}
		}
		// 과목 글자 수 3개 미만 과목 개수를 찾자 
		int count = 0;
		for (int i = 0; i < all2.length; i++) {
			if(all2[i].length() < 3) {
				count++;
			}
		}
		System.out.println(count);
		
		List<String> list = Arrays.asList(all2);
		System.out.println(list.indexOf("컴퓨터"));
	}

}
