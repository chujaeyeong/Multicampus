package 배열;

public class 배열개념 {

	public static void main(String[] args) {
		// 여러개의 데이터를 램에 저장해두고 cpu가 접근하여 사용하고 싶은 경우 사용하는 부
		// 1. 값을 이미 알고 있는 경우 
		int[] jumsu = {10, 20, 30, 40}; // length 만들어서 몇개인지 세서 값을 넣어줌. 그래서 변수개수+랭쓰 해서 5개 생김 
		System.out.println(jumsu[0]); // 첫번째값 
		System.out.println(jumsu[1]); // 두번째값 
		System.out.println(jumsu[2]); // 세번째값 
		System.out.println(jumsu[3]); // 네번째값 
		System.out.println(jumsu.length); // 전체 갯수 
		
		jumsu[0] = 100;
		System.out.println(jumsu[0]);
		
		
		// 2. 값을 아직 모르고 있는데, 먼저 저장공간을 만들어두고 나중에 값을 넣는 경우 
		int[] jumsu2 = new int[4]; // 일단 저장공간을 만든거임 
		jumsu2[0] = 200; 
		System.out.println(jumsu2[0]);

	}

}
