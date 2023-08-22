package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Locale;

import 화면DB연결.BookVO;

public class BookDAO {

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
		return result;
	}

	
	public int update(BookVO bag) {

		int result = 0;

		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); // 맥 벤추라에서 locale 에러때 필요한 코드

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:oracle:thin:@localhost:1523:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");

			// 3. SQL문을 만든다.
			// 자바는 부품조립식이어서, String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야함.
			// PrepareStatement가 SQL부품!!
			String sql = "update hr.BOOK set BOOK_TITLE = ?, BOOK_AUTHOR = ? where BOOK_ID = ? and BOOK_OWNER = ?";
			PreparedStatement ps = con.prepareStatement(sql); // con부품으로 sql스트링에 있는 것 sql부품으로 만들어주세요.
			ps.setString(1, bag.getBookTitle());
			ps.setString(2, bag.getBookAuthor());
			ps.setInt(3, bag.getBookId());
			ps.setString(4, bag.getBookOwner());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			// 4. SQL문을 전송한다.
			result = ps.executeUpdate(); // insert, update, delete문만! sql문 실행결과가 int
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("책 정보 수정 성공!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	
	public int delete(BookVO bag) {

		int result = 0;

		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); // 맥 벤추라에서 locale 에러때 필요한 코드

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:oracle:thin:@localhost:1523:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");

			// 3. SQL문을 만든다.
			// 자바는 부품조립식이어서, String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야함.
			// PrepareStatement가 SQL부품!!
			String sql = "delete from hr.BOOK where BOOK_ID = ? and BOOK_OWNER = ?";
			PreparedStatement ps = con.prepareStatement(sql); // con부품으로 sql스트링에 있는 것 sql부품으로 만들어주세요.
			ps.setInt(1, bag.getBookId());
			ps.setString(2, bag.getBookOwner());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			// 4. SQL문을 전송한다.
			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("책 정보 삭제 성공!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	
	public BookVO one(int bookId) {
		ResultSet rs = null; // 항목명 + 결과 데이터를 담고 있는 테이블
		// 기본형 정수/실수/문자/논리 만 값으로 초기화
		// 나머지 데이터형(참조형) 주소가 들어가있음
		// 참조형 변수를 초기화할때는 0 말고 null로 초기화하자
		BookVO bag = null;

		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); // 맥 벤추라에서 locale 에러때 필요한 코드

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:oracle:thin:@localhost:1523:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");

			// 3. SQL문을 만든다.
			// 자바는 부품조립식이어서, String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야함.
			// PrepareStatement가 SQL부품!!
			String sql = "select * from hr.BOOK where BOOK_ID = ? ";
			PreparedStatement ps = con.prepareStatement(sql); // con부품으로 sql스트링에 있는 것 sql부품으로 만들어주세요.
			ps.setInt(1, bookId);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			// 4. SQL문을 전송한다.
			rs = ps.executeQuery(); // select문 전송시
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (rs.next()) { // 검색결과가 있는지 여부는 re.next()로 체크
				// true이면 있다 라는 의미, false이면 없다 라는 의미
				System.out.println("검색결과 있음. 성공!");
				int bookId2 = rs.getInt(1); // no
				String bookTitle = rs.getString(2); // title
				String bookAuthor = rs.getString(3); // content
				String bookOwner = rs.getString(4); // writer

				// 검색결과를 검색화면 UI 부분을 주어야 함.
				bag = new BookVO();
				bag.setBookId(bookId);
				bag.setBookTitle(bookTitle);
				bag.setBookAuthor(bookAuthor);
				bag.setBookOwner(bookOwner);

			} else {
				System.out.println("검색결과 없음. 책 ID를 정확하게 입력하세요. ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return bag;
	}

	// 전체 BookList 
	public ArrayList<BookVO> list() {
		ResultSet rs = null; // 항목명 + 결과 데이터를 담고 있는 테이블

		ArrayList<BookVO> list = new ArrayList<>();

		BookVO bag = null;
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
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("2. 오라클 연결 성공.");

			// 3. SQL문을 만든다.
			// 자바는 부품조립식이어서, String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야함.
			// PrepareStatement가 SQL부품!!
			String sql = "select * from hr.BOOK";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement

			// 4. SQL문을 전송한다.
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery(); // select문 전송시
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			while (rs.next()) { // 검색결과가 있는지 여부는 rs.next()
				// true이면 있다라는 의미, false이면 없다라는 의미
				// 1. 검색경로가가 있으면,
				// 2. 각 컬럼에서 값들을 꺼내오자.
				System.out.println("검색결과 있음. 성공!");
				String bookId = rs.getString(1);
				int bookId2 = Integer.parseInt(bookId);
				String bookTitle = rs.getString(2);
				String bookAuthor = rs.getString(3);
				String bookOwner = rs.getString(4);

				// 검색결과를 검색화면 UI부분을 주어야 함.
				// 3. 가방을 만들자.
				bag = new BookVO();

				bag.setBookId(bookId2);
				bag.setBookTitle(bookTitle);
				bag.setBookAuthor(bookAuthor);
				bag.setBookOwner(bookOwner);

				// 4. list에 bag을 추가해주자.
				list.add(bag);
			}
			// System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// return id, pw, name, tel은 XXXXX!
		// return 뒤에는 반드시 여러 데이터를 묶어서 리턴해주어야 함.
		// 검색결과가 있을 때는 bag에 데이터가 들어있음.
		// 검색결과가 없을 때는 bag에 무엇이 들어있나? null
		return list;

	}

	
	// BookList -> 회원ID (bookOwner)로 검색하기
	public ArrayList<BookVO> list2(String bookOwner) {
		ResultSet rs = null; // 항목명 + 결과 데이터를 담고 있는 테이블

		ArrayList<BookVO> list2 = new ArrayList<>();

		BookVO bag = null;
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
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("2. 오라클 연결 성공.");

			// 3. SQL문을 만든다.
			// 자바는 부품조립식이어서, String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야함.
			// PrepareStatement가 SQL부품!!
			String sql = "select * from hr.BOOK where BOOK_OWNER = ?";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, bookOwner);
			
			// 4. SQL문을 전송한다.
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery(); // select문 전송시
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			while (rs.next()) { // 검색결과가 있는지 여부는 rs.next()
				// true이면 있다라는 의미, false이면 없다라는 의미
				// 1. 검색경로가가 있으면,
				// 2. 각 컬럼에서 값들을 꺼내오자.
				int bookId = rs.getInt(1);
				String bookTitle = rs.getString(2);
				String bookAuthor = rs.getString(3);
				String bookOwner2 = rs.getString(4);

				// 검색결과를 검색화면 UI부분을 주어야 함.
				// 3. 가방을 만들자.
				bag = new BookVO();

				bag.setBookId(bookId);
				bag.setBookTitle(bookTitle);
				bag.setBookAuthor(bookAuthor);
				bag.setBookOwner(bookOwner2);

				// 4. list에 bag을 추가해주자.
				list2.add(bag);
			}

			rs.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		// return id, pw, name, tel은 XXXXX!
		// return 뒤에는 반드시 여러 데이터를 묶어서 리턴해주어야 함.
		// 검색결과가 있을 때는 bag에 데이터가 들어있음.
		// 검색결과가 없을 때는 bag에 무엇이 들어있나? null
		return list2;
	}

	
	// BookList -> 책 이름 (bookTitle)로 검색하기
	public ArrayList<BookVO> list3(String bookTitle) {
		ResultSet rs = null; // 항목명 + 결과 데이터를 담고 있는 테이블

		ArrayList<BookVO> list3 = new ArrayList<>();

		BookVO bag = null;
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
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("2. 오라클 연결 성공.");

			// 3. SQL문을 만든다.
			// 자바는 부품조립식이어서, String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야함.
			// PrepareStatement가 SQL부품!!
			String sql = "select * from hr.BOOK where BOOK_TITLE = ?";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, bookTitle);
			
			// 4. SQL문을 전송한다.
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			rs = ps.executeQuery(); // select문 전송시
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			while (rs.next()) { // 검색결과가 있는지 여부는 rs.next()
				// true이면 있다라는 의미, false이면 없다라는 의미
				// 1. 검색경로가가 있으면,
				// 2. 각 컬럼에서 값들을 꺼내오자.
				int bookId = rs.getInt(1);
				String bookTitle2 = rs.getString(2);
				String bookAuthor = rs.getString(3);
				String bookOwner = rs.getString(4);

				// 검색결과를 검색화면 UI부분을 주어야 함.
				// 3. 가방을 만들자.
				bag = new BookVO();

				bag.setBookId(bookId);
				bag.setBookTitle(bookTitle2);
				bag.setBookAuthor(bookAuthor);
				bag.setBookOwner(bookOwner);

				// 4. list에 bag을 추가해주자.
				list3.add(bag);
			}

			rs.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		// return id, pw, name, tel은 XXXXX!
		// return 뒤에는 반드시 여러 데이터를 묶어서 리턴해주어야 함.
		// 검색결과가 있을 때는 bag에 데이터가 들어있음.
		// 검색결과가 없을 때는 bag에 무엇이 들어있나? null
		return list3;
	}
	
	
	// BookList -> 저자명 (bookAuthor)로 검색하기
	public ArrayList<BookVO> list4(String bookAuthor) {
		ResultSet rs = null; // 항목명 + 결과 데이터를 담고 있는 테이블

		ArrayList<BookVO> list4 = new ArrayList<>();

		BookVO bag = null;
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
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("2. 오라클 연결 성공.");

			// 3. SQL문을 만든다.
			// 자바는 부품조립식이어서, String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야함.
			// PrepareStatement가 SQL부품!!
			String sql = "select * from hr.BOOK where BOOK_AUTHOR = ?";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, bookAuthor);
			
			// 4. SQL문을 전송한다.
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			rs = ps.executeQuery(); // select문 전송시
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			while (rs.next()) { // 검색결과가 있는지 여부는 rs.next()
				// true이면 있다라는 의미, false이면 없다라는 의미
				// 1. 검색경로가가 있으면,
				// 2. 각 컬럼에서 값들을 꺼내오자.
				int bookId = rs.getInt(1);
				String bookTitle = rs.getString(2);
				String bookAuthor2 = rs.getString(3);
				String bookOwner = rs.getString(4);

				// 검색결과를 검색화면 UI부분을 주어야 함.
				// 3. 가방을 만들자.
				bag = new BookVO();

				bag.setBookId(bookId);
				bag.setBookTitle(bookTitle);
				bag.setBookAuthor(bookAuthor2);
				bag.setBookOwner(bookOwner);

				// 4. list에 bag을 추가해주자.
				list4.add(bag);
			}

			rs.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		// return id, pw, name, tel은 XXXXX!
		// return 뒤에는 반드시 여러 데이터를 묶어서 리턴해주어야 함.
		// 검색결과가 있을 때는 bag에 데이터가 들어있음.
		// 검색결과가 없을 때는 bag에 무엇이 들어있나? null
		return list4;
	}

}