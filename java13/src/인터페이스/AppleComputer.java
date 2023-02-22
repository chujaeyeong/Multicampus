package 인터페이스;

public class AppleComputer implements Computer {

	@Override
	public void 코딩하다() {
		System.out.println("이클립스IDE로 자바코딩을 하다.");
	}

	@Override
	public void 인터넷하다() {
		System.out.println("크롬으로 인터넷을 사용하다.");
	}

	@Override
	public void 유튜브하다() {
		System.out.println("여행 채널을 유튜브로 보다.");
	}

}
