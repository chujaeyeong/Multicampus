package 반복문;

public class IF문2 {

	public static void main(String[] args) {
		// 조건이 여러개일때
		int myNum = 40;
		
		// 점수가 80점 이상이면 최우수
		// 점수가 70점 이상이면 우수 프린트
		// 점수가 60점 이상이면 보통 프린트
		// 나머지는 미달
		
		if (myNum >= 80) {
			System.out.println("당신의 점수는 최우수점 입니다! ");
		} else if(myNum >= 70) {
			System.out.println("당신의 점수는 우수점 입니다! ");
		} else if(myNum >= 60) {
			System.out.println("당신의 점수는 보통 입니다! ");
		} else {
			System.out.println("두둥! 미달입니다...ㅠ ");
		}
		
		int myTour = 9; // 올해 여행 횟수
		// 여행 횟수가 10이면 "VVIP"
		// 여행 횟수가 6이면 "VIP"
		// 나머지면 "Normal" 프린트 
		
		
//		if (myTour == 10) {
//			System.out.println("VVIP");
//		} else if (myTour == 6) {
//			System.out.println("VIP");
//		} else {
//			System.out.println("Nomal");
//		}
		
		switch (myTour) {
		case 10:
			System.out.println("VVIP");
			break;

		default:
			break;
		}
		

	}

}
