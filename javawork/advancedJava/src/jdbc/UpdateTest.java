package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTest {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@192.168.25.2:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "update member ";
		sql = sql+"set addr='제주' ";
		sql=sql+"where id='jang'";
		Connection con = null;
		Statement stmt = null;
		try {
			//1. 드라이버로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버로딩성공!!");
			//2. DB서버에 커넥션
			con = DriverManager.getConnection(url, user, password);
			System.out.println("커넥션성공!!"+ con);
			//3. SQL을 실행하는 기능을 갖고 있는 객체 Statement생성
			stmt =  con.createStatement();
			System.out.println("Statement객체 생성 완료"+stmt);
			//4. SQL실행
			int result = stmt.executeUpdate(sql);
			System.out.println(result+"개 행 수정성공!!!!!!!!!!!!!");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(stmt!=null) stmt.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}




