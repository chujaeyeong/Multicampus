package 배열;

public class 배열연습 {

	public static void main(String[] args) {
		
		// 1. ~ 5.
		int[] week = {8, 9, 9, 8, 8, 2, 2}; 
		System.out.println(week[0]);  
		System.out.println(week[1]);
		
		System.out.println("week 변수 갯수는 " + week.length); 
		
		week[2] = 10;
		week[4] = 12;
		
		System.out.println(week[2]);
		System.out.println(week[4]);
		
		System.out.println("=================");
		
		// 6. ~ 8.
		int[] tour = new int[4]; 
		tour[0] = 20; 
		tour[2] = 30;
		
		System.out.println(tour[0]);
		System.out.println(tour[2]);
		
		System.out.println("tour 변수 갯수는 " + tour.length);
		

	}

}
