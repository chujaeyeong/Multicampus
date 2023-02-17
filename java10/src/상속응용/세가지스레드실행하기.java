package 상속응용;

public class 세가지스레드실행하기 {

	public static void main(String[] args) {
		앤드스레드 앤드 = new 앤드스레드();
		골뱅이스레드 골뱅이 = new 골뱅이스레드();
		달러스레드 달러 = new 달러스레드();
		
		앤드.start();
		골뱅이.start();
		달러.start();

	}

}
