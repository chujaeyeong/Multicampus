package 복습;

import java.util.ArrayList;

import javax.swing.JButton;

public class 아무거나 {

	public static void main(String[] args) {
		// 인덱스(순서)를 가지고 있는 ArrayList ==> 다이렉트로 직접 접근이 가능하다 
		ArrayList list = new ArrayList();
		list.add("홍길동"); // 오브젝트 <- 스트링 (자동형변환)
		list.add(100); // 오브젝트 <- Integer(랩퍼클래스) <- 오토박승 - int (기본형)
		list.add(11.22); // 오브젝트 <- 더블(랩퍼클래스, 포장클래스) <- 오토박싱 - double(기본형)
		list.add(new JButton()); // 오브젝트 <- JButton
		// Integer <-- 오토박싱 --- int
		//         --- 오토언박싱 --
		
		
		list.get(0); // 직접접근! 랜덤엑세스 가능 
		String name = (String)list.get(0);
		// String <- Object, 강제현변환
		int age = (Integer)list.get(1);
		// int <- Integer <- Object, 오토언박싱, 강제형변환 
		
	}

}
