package 상속응용test;

public class 알람시계스레드 {
	
	
	public static void main(String[] args) {
		카운트스레드 count = new 카운트스레드();
		카운트스레드2 count2 = new 카운트스레드2();
		타이머스레드 timer = new 타이머스레드();
		
		count.start(); // 5초
		count2.start(); // 3초 
		timer.start(); // 1초 
	}

}
