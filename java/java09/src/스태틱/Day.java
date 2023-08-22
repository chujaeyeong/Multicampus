package 스태틱;

public class Day {
	String doing;
	int time;
	String location;
	static int count;
	static int sum; // 누적이나 공유할 목적! ==> static 변수로! 
	
	public Day(String doing, int time, String location) {
		// new로 부품을 만드는 것 (객체생성)
		// 객체생성할때마다 꼭 처리하고싶은 내용이 있으면 
		// 생성자 메서드 내에 꼭 써주세요 
		// 
		count++;
		sum = sum + time; // sum += time; 이랑 똑같다 
		this.doing = doing;
		this.time = time;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}

}
