package 조건문;

import javax.swing.JOptionPane;

public class 설문조사2 {
	public static void main(String[] args) {
		// 인기투표 해 봅시다! 
		// 1)아이유 2)뉴진스 3)BTS 
		// 10명한테 인기투표를 받아서, 몇표 받았는지 출력해봅시다 
		
		int iu = 0;
		int newjeans = 0;
		int bts = 0;
		
		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("인기투표! 1)아이유 2)뉴진스 3)BTS");
			if (data.equals("1")) {
				iu++;
			} else if (data.equals("2")) {
				newjeans++;
			} else if (data.equals("3")) {
				bts++;
			} // if
		} // for
		
		System.out.println("인기투표 결과! 아이유는 " + iu + "표 입니다~");
		System.out.println("인기투표 결과! 뉴진스는 " + newjeans + "표 입니다~");
		System.out.println("인기투표 결과! BTS는 " + bts + "표 입니다~");
		
	}
}
