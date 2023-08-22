package test;

public class 딸 {

	String name;
	String gender;
	
	static int money = 10000;
	
	static int count;
	
	public static void TV() {
		System.out.println("아빠안잔다... (리모컨을 꽉 쥐며)");
	}
	
	public 딸(String name, String gender) {
		count++;
		this.name = name;
		this.gender = gender;
		
		money = money - 1000;
	}
	
	@Override
	public String toString() {
		return "딸 [name=" + name + ", gender=" + gender + "]";
	}
	
}
