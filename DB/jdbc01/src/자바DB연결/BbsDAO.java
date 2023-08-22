package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Locale;

import 화면DB연결.BbsVO;
import 화면DB연결.MemberVO;

// 테이블 하나당 DAO 하나! 

public class BbsDAO {
	
	public BbsVO one(int no) {
		ResultSet rs = null; // 항목명 + 결과 데이터를 담고 있는 테이블
		// 기본형 정수/실수/문자/논리 만 값으로 초기화 
		// 나머지 데이터형(참조형) 주소가 들어가있음 
		// 참조형 변수를 초기화할때는 0 말고 null로 초기화하자 
		BbsVO bag = null;
		
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
			String sql = "select * from hr.BBS where NO = ? ";
			PreparedStatement ps = con.prepareStatement(sql); // con부품으로 sql스트링에 있는 것 sql부품으로 만들어주세요. 
			ps.setInt(1, no);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
			
			// 4. SQL문을 전송한다. 
			rs = ps.executeQuery(); // select문 전송시 
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if(rs.next()) { // 검색결과가 있는지 여부는 re.next()로 체크 
				// true이면 있다 라는 의미, false이면 없다 라는 의미 
				System.out.println("검색결과 있음. 성공!");
				int no2 = rs.getInt(1); // no
				String title = rs.getString(2); // title
				String content = rs.getString(3); // content
				String writer = rs.getString(4); // writer
				System.out.println(no2 + " " + title + " " + content + " " + writer);
				
				// 검색결과를 검색화면 UI 부분을 주어야 함. 
				bag = new BbsVO();
				bag.setNo(no2);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(writer);
				
			} else {
				System.out.println("검색결과 없음...");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return bag;
	}
	
	
	public void delete(int no) {
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
			String sql = "delete from HR.BBS where NO = ?";
			PreparedStatement ps = con.prepareStatement(sql); // con부품으로 sql스트링에 있는 것 sql부품으로 만들어주세요. 
			ps.setInt(1, no);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
			
			// 4. SQL문을 전송한다. 
			ps.executeUpdate(); 
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void update(int no, String content) {
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
			String sql = "update hr.BBS set content = ? where NO = ?";
			PreparedStatement ps = con.prepareStatement(sql); // con부품으로 sql스트링에 있는 것 sql부품으로 만들어주세요. 
			ps.setString(1, content);
			ps.setInt(2, no);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
			
			// 4. SQL문을 전송한다. 
			ps.executeUpdate(); // insert, update, delete문만! sql문 실행결과가 int 
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	

	public int insert(BbsVO bag) {
		
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
			String sql = "insert into hr.BBS values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql); // con부품으로 sql스트링에 있는 것 sql부품으로 만들어주세요. 
			ps.setInt(1, bag.getNo());
			ps.setString(2, bag.getTitle());
			ps.setString(3, bag.getContent());
			ps.setString(4, bag.getWriter());
			// R 빼고 인덱스를 0으로 시작!!
			// 근데 유일하게 DB는 인덱스가 1부터 시작됨! 
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			result = ps.executeUpdate(); //1
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if(result == 1) {
				System.out.println("게시판 글쓰기 성공!");
			}
			//System.out.println(result);
		} catch (Exception e) {
			//insert가 제대로 안된 경우, 위험한 상황이라고 판단하고
			//catch가 실행
			//실행된 Row수가 없으므로 Result에 0을 넣어주자.!
			//result = 0;
			e.printStackTrace();
		}
		
		System.out.println(result);
		return result;
		
		

	}

}