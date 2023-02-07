package 반복문;

import javax.swing.JOptionPane;

public class 마지막확인문제 {

	public static void main(String[] args) {
//		// 1.
//		String pw = JOptionPane.showInputDialog("암호를 대시오~");
//		
//		if (pw.equals("pass")) { // true
//			System.out.println("들어오세요~ ");
//		} else {
//			System.out.println("나가세요 ㅡㅡ ");
//		}
		
//		// 2. 
//		String menu = JOptionPane.showInputDialog("저녁은 무엇을 먹고 싶은가요?");
//		
//		switch (menu) {
//		case "자장면":
//			System.out.println("중국집으로 가요! ");
//			break;
//		case "라면":
//			System.out.println("분식집으로 가요! ");
//		case "회":
//			System.out.println("횟집으로 가요! ");
//		default:
//			System.out.println("그냥 안 먹어요 ㅡㅡ ");
//			break;
//		}
		
		
		// 3.
//		String n1 = JOptionPane.showInputDialog("첫번째 정수를 입력하세요!");
//		String n2 = JOptionPane.showInputDialog("두번째 정수를 입력하세요!");
//		
//		int n11 = Integer.parseInt(n1);
//		int n22 = Integer.parseInt(n2);
//			
//		
//		if (n11 > n22) {
//			System.out.println("첫번째 수가 더 큽니다!");
//		} else if (n11 < n22) {
//			System.out.println("첫번째 수가 더 작습니다!");
//		} else {
//			System.out.println("두 수가 같습니다! ");
//		}
		
		
		// 4.
		String no = "A100EX";
		char ch = no.charAt(0); // 'A'
		switch (ch) {
		case 'A':
			System.out.println("기획부");
			break;
		case 'B':
			System.out.println("총무부");
			break;
		case 'C':
			System.out.println("개발부");
			break;
		}
		
		
		
		
		


	}

}
