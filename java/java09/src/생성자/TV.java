package 생성자;

public class TV {

	// 멤버변수, 선언이 클레스 바로 아래에 되었기 때문에
	// 클래스 전체 영역에서 이 변수를 사용할 수 있음.
	// ==> 전역변수 (global변수, 글로벌변수)
	// 멤버변수는 자동초기화를 시켜줌 (전역변수는 자동초기화된다.)

	public int ch; // 0
	public int vol; // 0
	public boolean onOff; // false로 초기화됨

	// 다른 생성자 메서드가 없으면 부품 만들때 (객체생성) 자동으로 생성됨.
	// 기본생성자 (default constructor)
//	public TV() {
//		// 이게 자동으로 만들어지는 메서드 (함수)
//		System.out.println("TV 객체가 하나 생성됨. ");
//	}
//	public TV(int ch, int vol, boolean onOff) { // 매개변수 (파라메터)
//		// 무더기영역(힙영역)에 저장된 멤버변수에 값을 넣어주는 역할 
//		this.ch = ch;
//		this.vol = vol;
//		this.onOff = onOff;
//	}

	public TV(int ch, int vol, boolean onOff) {
		this.ch = ch;
		this.vol = vol;
		this.onOff = onOff;
	}

	public void 유튜브보다() { // 메서드를 만드는 것 ==> 메서드를 정의한다 라고 표현함
		System.out.println(vol + "을 키워서 동영상을 보다.");
	}

	// 객체생성할때마다 꼭 실행시키고 싶은 내용이 있으면 기본 생성자를 눈에 보이게 다시 만들어주세요 (명시적으로)

	public void 채널을바꾸다() {
		int change = 1; // 지역변수 (local변수 로컬변수 라고 읽음) , 로컬변수는 자동초기화되지않음!
		System.out.println(ch + "에서" + change + "로 바꾸다");
	}

}
