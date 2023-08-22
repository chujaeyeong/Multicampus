package test;

public class 우리집 {

	public static void main(String[] args) {
		딸 d1 = new 딸("홍길순", "여");
		딸 d2 = new 딸("홍길진", "여");
		
		System.out.println(d1);
		System.out.println(d2);
		
		System.out.println("홍씨네 집 아버지 지갑 잔액은 " + 딸.money + "원 입니다. ");
		
		System.out.println("홍씨네 집 딸은 총 " + 딸.count + "명 입니다. ");
		
	}

}
