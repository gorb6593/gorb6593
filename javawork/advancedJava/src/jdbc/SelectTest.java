package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@221.161.111.20:1521:xe";
		String user = "scott";
		String password = "tiger";
		StringBuffer sql = new StringBuffer();
		sql.append("select * from member");
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//1. 드라이버로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버로딩성공!!");
			//2. DB서버에 커넥션
			con = DriverManager.getConnection(url, user, password);
			System.out.println("커넥션성공!!"+ con);
			//3. SQL을 실행하는 기능을 갖고 있는 객체 Statement생성(ResultSet의 하위인 OracleResultSetImpl리턴)
			stmt =  con.createStatement();
			//4. SQL실행 - select문
			rs = stmt.executeQuery(sql.toString());
			System.out.println("조회성공-"+rs);
			//5. 결과 처리 -> ResultSet에 저장된 데이터를 꺼내서 application에서 출력
			while(rs.next()) {
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString("pass")+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\t");
				System.out.print(rs.getInt(5)+"\t");
				System.out.println(rs.getString(6));
			}
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
