package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Locale;

import 화면DB연결.BookVO;

public class BookDAO {

//	public BookVO one(String id) {
//		ResultSet rs = null; // 항목명 + 결과 데이터를 담고 있는 테이블
//		// 기본형 정수/실수/문자/논리 만 값으로 초기화
//		// 나머지 데이터형(참조형) 주소가 들어가있음
//		// 참조형 변수를 초기화할때는 0 말고 null로 초기화하자
//		BookVO bag = null;
//
//		try {
//			// 1.오라클 11g와 연결한 부품 설정
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
//			Locale.setDefault(Locale.US); // 맥 벤추라에서 locale 에러때 필요한 코드
//
//			// 2.오라클 11g에 연결해보자.(java --- oracle)
//			String url = "jdbc:oracle:thin:@localhost:1523:xe";
//			String user = "system";
//			String password = "oracle";
//			Connection con = DriverManager.getConnection(url, user, password);
//			System.out.println("2. 오라클 연결 성공.");
//
//			// 3. SQL문을 만든다.
//			// 자바는 부품조립식이어서, String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
//			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
//			// SQL부품으로 만들어주어야함.
//			// PrepareStatement가 SQL부품!!
//			String sql = "select * from hr.MEMBER where id = ? ";
//			PreparedStatement ps = con.prepareStatement(sql); // con부품으로 sql스트링에 있는 것 sql부품으로 만들어주세요.
//			ps.setString(1, id);
//			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
//
//			// 4. SQL문을 전송한다.
//			rs = ps.executeQuery(); // select문 전송시
//			System.out.println("4. SQL문 오라클로 보내기 성공.");
//			if (rs.next()) { // 검색결과가 있는지 여부는 re.next()로 체크
//				// true이면 있다 라는 의미, false이면 없다 라는 의미
//				System.out.println("검색결과 있음. 성공!");
//				String id2 = rs.getString(1); // id
//				String pw = rs.getString(2); // pw
//				String name = rs.getString(3); // name
//				String tel = rs.getString(4); // tel
//				System.out.println(id2 + " " + pw + " " + name + " " + tel);
//
//				// 검색결과를 검색화면 UI 부분을 주어야 함.
//				bag = new BookVO();
//				bag.setId(id2);
//				bag.setPw(pw);
//				bag.setName(name);
//				bag.setTel(tel);
//
//			} else {
//				System.out.println("검색결과 없음...");
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return bag;
//	}
//
//	public int delete(String id) {
//		int result = 0;
//
//		try {
//			// 1.오라클 11g와 연결한 부품 설정
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
//			Locale.setDefault(Locale.US); // 맥 벤추라에서 locale 에러때 필요한 코드
//
//			// 2.오라클 11g에 연결해보자.(java --- oracle)
//			String url = "jdbc:oracle:thin:@localhost:1523:xe";
//			String user = "system";
//			String password = "oracle";
//			Connection con = DriverManager.getConnection(url, user, password);
//			System.out.println("2. 오라클 연결 성공.");
//
//			// 3. SQL문을 만든다.
//			// 자바는 부품조립식이어서, String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
//			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
//			// SQL부품으로 만들어주어야함.
//			// PrepareStatement가 SQL부품!!
//			String sql = "delete from hr.MEMBER where id = ? ";
//			PreparedStatement ps = con.prepareStatement(sql); // con부품으로 sql스트링에 있는 것 sql부품으로 만들어주세요.
//			ps.setString(1, id);
//			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
//
//			// 4. SQL문을 전송한다.
//			result = ps.executeUpdate();
//			System.out.println("4. SQL문 오라클로 보내기 성공.");
//			if (result == 1) {
//				System.out.println("탈퇴 성공");
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return result;
//	}
//
//	// 1. 가방을 받아서 저장해두자.
//	// 2. 필요할 때 가방에서 값들을 하나씩 꺼내자.
//
//	public int update(BookVO bag) {
//
//		int result = 0;
//
//		try {
//			// 1.오라클 11g와 연결한 부품 설정
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
//			Locale.setDefault(Locale.US); // 맥 벤추라에서 locale 에러때 필요한 코드
//
//			// 2.오라클 11g에 연결해보자.(java --- oracle)
//			String url = "jdbc:oracle:thin:@localhost:1523:xe";
//			String user = "system";
//			String password = "oracle";
//			Connection con = DriverManager.getConnection(url, user, password);
//			System.out.println("2. 오라클 연결 성공.");
//
//			// 3. SQL문을 만든다.
//			// 자바는 부품조립식이어서, String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
//			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
//			// SQL부품으로 만들어주어야함.
//			// PrepareStatement가 SQL부품!!
//			String sql = "update hr.MEMBER set tel = ? where id = ?";
//			PreparedStatement ps = con.prepareStatement(sql); // con부품으로 sql스트링에 있는 것 sql부품으로 만들어주세요.
//			ps.setString(1, bag.getTel());
//			ps.setString(2, bag.getId());
//			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
//
//			// 4. SQL문을 전송한다.
//			result = ps.executeUpdate(); // insert, update, delete문만! sql문 실행결과가 int
//			System.out.println("4. SQL문 오라클로 보내기 성공.");
//			if (result == 1) {
//				System.out.println("수정 성공");
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return result;
//	}

	public int insert(BookVO bag) {
		// 1. 가방을 받아서 변수에 넣기 
		int result = 0;

		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); // 맥 locale에러나신 분들만!!!

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:oracle:thin:@localhost:1523:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); // Connection

			System.out.println("2. 오라클 연결 성공.");

			String sql = "insert into hr.BOOK values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			
			// 3. 가방에서 값들을 하나씩 꺼내쓰세요
			ps.setInt(1, bag.getBookId()); 
			ps.setString(2, bag.getBookTitle());
			ps.setString(3, bag.getBookAuthor());
			ps.setString(4, bag.getBookOwner());
			
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			result = ps.executeUpdate(); // 1
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("책 등록 성공! ");
			}
			// System.out.println(result);
		} catch (Exception e) {
			// insert가 제대로 안된 경우, 위험한 상황이라고 판단하고
			// catch가 실행
			e.printStackTrace();
		}

		System.out.println(result);
		return result;

	}

}