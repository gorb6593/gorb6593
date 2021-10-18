package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class practice_preparedstatemenupdate {
	public static void main(String[] args) {
		practice_preparedstatemenupdate obj = new practice_preparedstatemenupdate();
		Scanner key = new Scanner(System.in);
		System.out.print("사용자아이디:");
		String id = key.next();
		System.out.print("주소:");
		String addr = key.next();
		obj.update(addr, id);
	}
	public void update(String addr, String id) {
		String url = "jdbc:oracle:thin:@221.161.111.20:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "update member ";
		sql = sql+"set addr= ? ";
		sql = sql+"where id= ? ";
		Connection con = null;
		PreparedStatement stmt = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			stmt = con.prepareStatement(sql);
			stmt.setString(1, addr);
			stmt.setString(2, id);
			int result = stmt.executeUpdate();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(stmt!=null) stmt.close();
				if(con!=null) con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
