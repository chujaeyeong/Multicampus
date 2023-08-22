package 복습;

// import 라는 것은 jop이 javax 폴더 아래 swing 폴더 아래에 있음을 알려줌
// 위치를 알려주는 역할!!
import javax.swing.JOptionPane;

public class 조건문 {

	public static void main(String[] args) {
		int target = 77; // 숫자맞추기놀이! 
		int me = 88; // 내가 시도한 값 
		
		// 조건은 비교하는 코드가 들어감. 결과가 무조건 논리형 (참/거짓)
		if (target == me) {
			System.out.println("정답입니다!! ");
		} else {
			System.out.println("오답입니다!! ");
		}
		// if문은 조건이 만족하면 처리하고 더이상 실행되지않음! 
		// if문은 자체 break 기능이 있다. 
		
		
		// switch 기능은 자체 브레이크 기능이 없음.
		// 내가 멈추고 싶은 부분에 브레이크를 써주어야함!!! 

		String you = "신나";
		switch (you) {
		case "로또":
			System.out.println("정답이다!!! ");
			break;
		case "신나": case "놀자": case "나가자":
			System.out.println("오답이다!!! ");
			break;
		default: // 위의 조건이 다 아닐때 실행하고 싶은 내용이 있으면 디폴트에 넣어줌. (생략가능)
			System.out.println("그만해!");
			break;
		}
		
	}

}
