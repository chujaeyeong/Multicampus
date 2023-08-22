package 상속응용;

// 동시에 실행시키고 싶은 부품인 Thread로 만들어주세요! 
public class 증가스레드 extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("증가 >> " + i);
		}
	}
	
}
