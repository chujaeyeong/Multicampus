package 반복문;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class For2 {

	public static void main(String[] args) {
		for (; ;) { // 무한 루프, 별로 선호하지 않음!! while(true) 라고 써도 무한루프 
			System.out.println("잘 쓰지 않음. ");
			String data = JOptionPane.showInputDialog("종료할까요?? y를 입력 ");
			// == 연산자는 기본 데이터만 비교 가능
			// 스트링 부품에서 제공하는 기능을 사용해서 비교해주어야 함. 
			if (data.equals("y")) {
				System.out.println("안녕히가세용");
				break; // 이건 if의 브레이크가 아니라, 포문의 브레이크임!!
			} 
			
		}
	}

}
