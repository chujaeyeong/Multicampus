package 스태틱;

public class 회사창업 {

	public static void main(String[] args) {
		직원 work1 = new 직원("홍길동", 25, "여");
		직원 work2 = new 직원("김길동", 24, "남");
		직원 work3 = new 직원("송길동", 26, "여");
		
		System.out.println("직원 수는 " + 직원.count);
		System.out.println(work1);
		System.out.println(work2);
		System.out.println(work3);
		System.out.println("회사 직원들의 평균 나이는 " + (직원.sum / 직원.count));
		
		// 스태틱 변수는 하나의 변수를 만들어 값을 공유할 목적으로 만든다. 
		// 스태틱 메서드는 객체생성하지 않고, 바로 특정한 기능을 자주 사용할 목적으로 만든다. 

	}

}
