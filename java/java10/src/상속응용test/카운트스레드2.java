package 상속응용test;

public class 카운트스레드2 extends Thread {

	@Override
	public void run() {
		for (int i = 500; i > 0; i--) {
			System.out.println("지각 무서운줄 모르는군...");

			try {
				Thread.sleep(3000); //2초재워라!
			} catch (Exception e) {
				System.out.println("cpu 연결 문제 생김.");
			}
		}
	}
}