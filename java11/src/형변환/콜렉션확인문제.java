package 형변환;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class 콜렉션확인문제 {

	public static void main(String[] args) {
		
		// 1. 중복제거 ==> set
		
		HashSet tour = new HashSet();
		
		tour.add("일본");
		tour.add("중국");
		tour.add("싱가폴");
		tour.add("미국");
		tour.add("일본");
		
		System.out.println(tour);
		
		// 2. 키+값을 쌍으로 넣을 때는 ==> map
		HashMap home = new HashMap();
		home.put("안방", "TV");
		home.put("거실", "쇼파");
		home.put("부엌", "냉장고");
		home.put("현관", "신발");
		
		System.out.println(home);
		System.out.println(home.get("현관"));
		home.replace("거실", "책상");
		System.out.println(home);
		
		// 3. 할 일 우선순위(순서) ==> list
		LinkedList todo = new LinkedList();
		todo.add("자바공부");
		todo.add("져넉먹기");
		todo.add("운동");
		todo.add("TV보기");
		todo.add("쉬기");
		
		System.out.println(todo);
		
		System.out.println(todo.get(0));
		System.out.println(todo.get(4));
		
		todo.set(1, "청소");
		System.out.println(todo);
		
	}

}
