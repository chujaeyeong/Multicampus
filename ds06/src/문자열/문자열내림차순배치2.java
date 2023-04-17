package 문자열;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 문자열내림차순배치2 {

	public static void main(String[] args) {
		String s = "Zbcdefg";
		String answer = "";

		// 1-1. 내림차순으로 정렬을 한 후,
		// 문자들을 하나씩 떨어뜨려야 한다. ==> ArrayList, 배열
		char[] c = s.toCharArray();
		Arrays.sort(c); // 오름차순 정렬

		String s2 = new String(c);
		System.out.println(s2);

		// char[]을 이용해서 String으로 바로 만들 수 있음.

		StringBuilder sb = new StringBuilder(s2);
		answer = sb.reverse().toString();
		System.out.println(answer);
	}

}
