package 메서드연습;

public class 내가게3 {

	public static void main(String[] args) {
		계산기3 cal3 = new 계산기3();
		int price = 7000;
		int count1 = 5; // 오전에 온 손님 수 
		int count2 = 4; // 오후에 온 손님 수 
		
		// 계산기3 이용하기 
		// 1.
		int result1 = cal3.add(count1, count2);
		System.out.println("전체 손님은 " + result1 + "명 입니다.");
		
		// 2.
		int result2 = cal3.minus(count1, count2);
		System.out.println("오전과 오후 손님 수 차이는 " + Math.abs(result2) +"명 입니다.");
		System.out.println(Math.PI);
		System.out.println(Math.ceil(3.334)); // 이건 올림 
		System.out.println(Math.floor(3.334)); // 이건 내림
		System.out.println(Math.round(3.334)); // 이건 반올림
		System.out.println(Math.round(3.534));
		System.out.println(Math.sqrt(100)); //루트
		System.out.println(Math.max(100, 200)); 
		System.out.println(Math.min(100, 200)); 
		System.out.println(Math.pow(2, 3)); //2의 3승
		// 마이너스를 없애고 싶으면 Math.abs를 써주면된당~ 
		
		// 3.
		int result3 = cal3.mul(count1, price);
		System.out.println("오전 결제 금액은 " + result3 + "원 입니다. ");
		
		// 4.
		int result4 = cal3.mul(count2, price);
		System.out.println("오후 결제 금액은 " + result4 + "원 입니다. ");
		
		// 5.
		int result5 = cal3.add(result3, result4);
		System.out.println("오늘 하루 총 결제 금액은 " + result5 + "원 입니다.");
		
		// 6. 
		int result6 = cal3.div(result5, result1);
		System.out.println("1인당 결제 금액은 " + result6 + "원 입니다.");
	}

}
