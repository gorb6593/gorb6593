package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementDeleteTest {
	public static void main(String[] args) {
		PreparedStatementDeleteTest obj = new PreparedStatementDeleteTest();
		Scanner key = new Scanner(System.in);
		System.out.print("삭제할아이디:");
		String id = key.next();
		obj.delete(id);
	}
	public void delete(String id) {
		String url = "jdbc:oracle:thin:@221.161.111.20:1521:xe";
		String user = "scott";
		String password = "tiger";
		StringBuffer sql = new StringBuffer();
		sql.append("delete member ");
		sql.append("where id=? ");
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			stmt = con.prepareStatement(sql.toString());
			stmt.setString(1, id);
			int result = stmt.executeUpdate();
			System.out.println(result+"개 행 삭제성공!!!!!!!!!!!!!");
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




