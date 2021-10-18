package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class practice_preparedstatementdelete {
	public static void main(String[] args) {
		practice_preparedstatementdelete obj = new practice_preparedstatementdelete(); 
		Scanner key = new Scanner(System.in);
		System.out.println("삭제할 이름:");
		String name = key.next();
		obj.delete(name);		
	}
	public void delete(String name) {
		String url = "jdbc:oracle:thin:@221.161.111.20:1521:xe";
		String user = "scott";
		String password = "tiger";
		StringBuffer sql = new StringBuffer();
		sql.append("delete member ");
		sql.append("where name=? ");
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			stmt = con.prepareStatement(sql.toString());
			stmt.setString(1, name);
			int result = stmt.executeUpdate();				
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
