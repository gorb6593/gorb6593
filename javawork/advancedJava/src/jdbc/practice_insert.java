package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class practice_insert {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@221.161.111.20:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "insert into member values('haekyu','4321','해규','울산',1000,'100')";
		Statement stmt = null;
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");			
			con = DriverManager.getConnection(url, user, password);
			System.out.println("커넥션성공"+con);
			stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
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
