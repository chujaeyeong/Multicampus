package 상속응용;

// 동시에 실행시키고 싶은 부품인 Thread로 만들어주세요! 
// Thread 클래스 만들면 바로 만들어짐. 
public class 감소스레드 extends Thread{
	
	// 동시에 실행할 내용을 run()메서드 안에 넣어주세요. 
	@Override
	public void run() {
		for (int i = 100; i < 100; i--) {
			System.out.println("감소 >> " + i);
		}
	}
	
}
