package multi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Locale;

public class MailDAO {

	public ArrayList<MailVO> list() {
		ResultSet rs = null; 
		
		ArrayList<MailVO> list = new ArrayList<>();

		MailVO bag = null;
		try {
			// 1.mysql과 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); // 맥 locale에러나신 분들만!!!

			// 2.mysql에 연결해보자.(java --- mysql)
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			System.out.println("2. mySQL과 연결 성공.");
			
			// 3. 
			String sql = "select mailno, email, title, maildate from mail";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery(); // select문 전송시
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			while (rs.next()) { // 검색결과가 있는지 여부는 rs.next()
				// 1 ~ 2. 가방 만들고 값 넣는거 동시에 하기
				bag = new MailVO();

				bag.setMailno(rs.getString("mailno")); 
				bag.setEmail(rs.getString("email"));
				bag.setTitle(rs.getString("title"));
				bag.setMaildate(rs.getString("maildate"));

				// 3.컨테이너에 가방을 넣자.(row의 갯수)
				list.add(bag);
			}
			// System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public MailVO one(String mailno) {
		ResultSet rs = null; 
		
		MailVO bag = null;

		try {
			// 1.mysql과 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); // 맥 locale에러나신 분들만!!!

			// 2.mysql에 연결해보자.(java --- mysql)
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			
			System.out.println("2. mySQL과 연결 성공.");

			// 3. 
			String sql = "select * from mail where mailno = ? ";
			PreparedStatement ps = con.prepareStatement(sql); // con부품으로 sql스트링에 있는 것 sql부품으로 만들어주세요.
			ps.setString(1, mailno);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			// 4. SQL문을 전송한다.
			rs = ps.executeQuery(); // select문 전송시
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (rs.next()) { // 검색결과가 있는지 여부는 re.next()로 체크
				// true이면 있다 라는 의미, false이면 없다 라는 의미
				bag = new MailVO();

				bag.setMailno(rs.getString("mailno"));// 가방 만들고 값 넣는거 동시에 하기
				bag.setEmail(rs.getString("email"));
				bag.setTitle(rs.getString("title"));
				bag.setContent(rs.getString("content"));
				bag.setMaildate(rs.getString("maildate"));
				
			} else {
				System.out.println("검색결과 없음...");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return bag;
	}

	public int delete(String mailno) {
		int result = 0;

		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); // 맥 locale에러나신 분들만!!!

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			// String url = "jdbc:mysql://localhost:3306/multi";
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("2. mySQL과 연결 성공.");

			// 3. SQL문을 만든다.
			// 자바는 부품조립식이어서, String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야함.
			// PrepareStatement가 SQL부품!!
			String sql = "delete from mail where mailno = ? ";
			PreparedStatement ps = con.prepareStatement(sql); // con부품으로 sql스트링에 있는 것 sql부품으로 만들어주세요.
			ps.setString(1, mailno);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			// 4. SQL문을 전송한다.
			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("메일 보내기 취소 성공");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	// 1. 가방을 받아서 저장해두자.
	// 2. 필요할 때 가방에서 값들을 하나씩 꺼내자.

	public int update(MailVO bag) {

		int result = 0;

		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); // 맥 locale에러나신 분들만!!!

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			// String url = "jdbc:mysql://localhost:3306/multi";
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("2. mySQL과 연결 성공.");

			// 3. SQL문을 만든다.
			// 자바는 부품조립식이어서, String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야함.
			// PrepareStatement가 SQL부품!!
			String sql = "update mail set content = ? where mailno = ?";
			PreparedStatement ps = con.prepareStatement(sql); // con부품으로 sql스트링에 있는 것 sql부품으로 만들어주세요.
			ps.setString(1, bag.getContent());
			ps.setString(2, bag.getMailno());
			
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			// 4. SQL문을 전송한다.
			result = ps.executeUpdate(); // insert, update, delete문만! sql문 실행결과가 int
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("메일 수정 성공");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	// public void add2() {
	public int insert(MailVO bag) {
		// 1. 가방을 받아서 변수에 넣어주세요.
		int result = 0;

		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); // 맥 locale에러나신 분들만!!!

			// 2.오라클 11g에 연결해보자.(java --- oracle)
//			String url = "jdbc:mysql://localhost:3306/multi";
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("2. mySQL과 연결 성공.");

			// ipaddress ==> InetAddress
			// String url = "http://wwww.naver.com";
			// URL u = new URL(url);
			// 자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야 함.
			// PreparedStatement가 SQL부품!!

			// public void insert(String id, String pw, String name, String tel)
			String sql = "insert into mail values (?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			// con부품으로 sql스트링에 있는 것 SQL부품으로 만들어주세요.
			// R빼고, 인덱스 0부터 시작!!
			// 유일하게 db은 인덱스가 1부터 시작!!
			// 2. 가방에서 값들을 하나씩 꺼내쓰세요
			ps.setString(1, bag.getMailno());
			ps.setString(2, bag.getEmail());
			ps.setString(3, bag.getTitle());
			ps.setString(4, bag.getContent());
			ps.setString(5, bag.getMaildate());
			// ==> insert into hr.MEMBER values ('a','a','a','a');
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			result = ps.executeUpdate(); // 1
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("영화정보 등록 성공!");
			}
			// System.out.println(result);
		} catch (Exception e) {
			// insert가 제대로 안된 경우, 위험한 상황이라고 판단하고
			// catch가 실행
			// 실행된 Row수가 없으므로 Result에 0을 넣어주자.!
			// result = 0;
			e.printStackTrace();
		}

		System.out.println(result);
		return result;

	}

}