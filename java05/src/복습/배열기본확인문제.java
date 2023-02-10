package 복습;

public class 배열기본확인문제 {

	public static void main(String[] args) {
		
		String[] travel = {"서울", "부산", "대구", "제주도", "일본"};
		for (int i = 0; i < travel.length; i++) {
			System.out.println(i + " : " + travel[i]);
		}
		for (String t : travel) {
			System.out.println(t);
		}
		
		
		char[] color = {'r', 'g', 'b', 'p', 'v'};
		for (int i = 0; i < color.length; i++) {
			System.out.println(i + " : " + color[i]);
		}
		for (char c : color) {
			System.out.println(c);
		}
		
		
		double[] height = {180.5, 185,1, 175.5, 170.2, 177.8};
		for (int i = 0; i < height.length; i++) {
			System.out.println(i + " : " + height[i]);
		}
		for (double h : height) {
			System.out.println(h);
		}
	}

}
