package 자바DB연결;

import java.util.Scanner;

public class 게시판글쓰기 {

	public static void main(String[] args) {
		
		// 입력해보자! 
		Scanner sc = new Scanner(System.in);
		System.out.println("게시판 글쓰기 입니다. no / title / content / writer 순으로 입력하세요!");
		int no = sc.nextInt();
		String title = sc.next();
		String content = sc.next();
		String writer = sc.next();
		
		
		BbsDAO dao = new BbsDAO();
		dao.insert(no, title, content, writer);  
		
		// 1. JDBC 4단계 정리 
		// 드라이버 설정 -> DB연결 -> SQL문 객체로 만들고, -> SQL문 전송 
		
		// 2. DAO에 주로 넣는 기능 4가지 
		
		// 3. DAO : Date Access Object => DML - CRUD - insert, select, update, delect
		
		// 4. create(insert문)
		
		// 5. ? (물음표)
		

	}

}
