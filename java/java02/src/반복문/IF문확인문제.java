package 반복문;

import java.util.Date;

public class IF문확인문제 {

	public static void main(String[] args) {
		// 시간을 구해주는 부품 ==> Date !!! java.util.Date

		Date date = new Date();

		// 1.
		if ((date.getYear() + 1900) >= 2000) {
			System.out.println("밀레니엄 세대시군요!");
		} else {
			System.out.println("밀레니엄 세대가 아니시군요!");
		}

		// 2.
		switch (date.getDay()) {
		case 6:
		case 0:
			System.out.println("토일은 쉬~~~자! ");
			break;
		default:
			System.out.println("주중에는 열심히 공부하자!!! ");
			break;
		}

		// 3.
		int month = date.getMonth() + 1;

		switch (month) {
		case 2:
			System.out.println("2월이니까 마지막 날은 28일 입니다! ");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("마지막 날은 30일 입니다!");
			break;
		default:
			System.out.println("마지막 날은 31일 입니다!");
			break;
		}
	}

}
