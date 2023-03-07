package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Locale;

public class MemberDAO2 {
	
	public void delete(String id) {
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
			String sql = "delete from hr.MEMBER where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); // con부품으로 sql스트링에 있는 것 sql부품으로 만들어주세요. 
			ps.setString(1, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
			
			// 4. SQL문을 전송한다. 
			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void update(String id, String tel) {
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
			String sql = "update hr.MEMBER set tel = ? where id = ?";
			PreparedStatement ps = con.prepareStatement(sql); // con부품으로 sql스트링에 있는 것 sql부품으로 만들어주세요. 
			ps.setString(1, tel);
			ps.setString(2, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
			
			// 4. SQL문을 전송한다. 
			ps.executeUpdate(); // insert, update, delete문만! sql문 실행결과가 int 
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	

	public void insert(String id, String pw, String name, String tel) {
		
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
			String sql = "insert into hr.MEMBER values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql); // con부품으로 sql스트링에 있는 것 sql부품으로 만들어주세요. 
			ps.setString(1, id);
			ps.setString(2, pw);
			ps.setString(3, name);
			ps.setString(4, tel);
			// R 빼고 인덱스를 0으로 시작!!
			// 근데 유일하게 DB는 인덱스가 1부터 시작됨! 
			
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
			
			// 4. SQL문을 전송한다. 
			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}