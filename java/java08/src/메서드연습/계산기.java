package 메서드연습;

public class 계산기 {
	public void 더하기(int x, int y) { // 더하기(2,3)
		System.out.println("더하기 기능 처리 방법 내용 ... ");
		System.out.println(x + y);
	}
	
	public void 곱하기(int x, int y, int z) {
		System.out.println("이것은 곱하기란다 ");
		System.out.println(x * y * z);
	}
	
	public int 빼기(int x, int y) { // 매개변수 (파라메터, parametor)
		System.out.println("이것은 빼기란다 ");
		return x - y;
	}
}
