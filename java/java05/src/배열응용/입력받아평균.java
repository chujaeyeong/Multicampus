package 배열응용;

import javax.swing.JOptionPane;

public class 입력받아평균 {

	public static void main(String[] args) {
		// 입력을 여러번 받아서 
		// 저장공간에 넣고 싶을 때 ==> 배열을 사용해라 !!
		
		//1. 배열을 만들어주세요. 
		int[] jumsu = new int[5];
		
		// 배열에 값을 넣을 때는 index가 필요 ==> i가 있는 for문을 사용!!
		for (int i = 0; i < jumsu.length; i++) {
			String data = JOptionPane.showInputDialog("숫자 입력");
			// 숫자로 변환한 값을 배열의 해당 인덱스에 값으로 넣자. 
			jumsu[i] = Integer.parseInt(data);
		}
		for (int x : jumsu) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		// 1. 전체 합계 구해서, 평균 구해보세요. (평균  = 합계 / 전체갯수)
		// 2. 300 이상 되는 숫자만 찾아서 합계를 구해보세요. 
		// 3. (심화문제) 300 이상 되는 위치인 index를 프린트 
		
//		int sum = 0;
//		int sum2 = 0;
//		int count = 0;
//		
//		for (int i = 0; i < jumsu.length; i++) {
//			sum = sum + jumsu[i];
//		} 
//		System.out.println("총합은 " + sum);
//		System.out.println("평균은 " + (sum / 5));
//		
//		for (int i = 0; i < jumsu.length; i++) {
//			if (jumsu[i] >= 300) {
//				count++;
//				sum2 = sum2 + jumsu[i];
//			}
//		}
//		System.out.println("300이상 갯수: " + count);
//		System.out.println("300이상 값의 총합: " + sum2);
		
		
		int sum = 0;
		for (int x : jumsu) {
			sum = sum + x;
		}
		System.out.println("전체합계 : " + sum);
		
		double avg = (double)sum / jumsu.length;
		System.out.println("전체 평균 : " + avg);
		
		int sum2 = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300) {
				sum2 = sum2 + jumsu[i];
			}
		}
		System.out.println("300 이상 되는 합계 : " + sum2);
		
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300) {
				// 특정한 index에 있는 값이 300 이상인 위치를 프린트 해보세요!
				System.out.println("300인 값이 저장된 인덱스 : " + i);
				
			}
		}
		
		
	}

}
