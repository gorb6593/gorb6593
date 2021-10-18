package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class practice_preparedstatementinsert {
	public static void main(String[] args) {
		practice_preparedstatementinsert obj = new practice_preparedstatementinsert();
		Scanner key = new Scanner(System.in);
		System.out.println("아이디:");
		String id = key.next();
		System.out.println("비밀번호:");
		String pass = key.next();
		System.out.println("성명:");
		String name = key.next();
		System.out.println("주소:");
		String addr = key.next();
		System.out.println("부서번호:");
		String deptno = key.next();
		obj.insert(id, pass, name, addr, deptno);
	}
	public void insert(String id, String pass, String name, String addr, String deptno) {
		String url = "jdbc:oracle:thin:@221.161.111.20:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "insert into member values(?,?,?,?,1000,?)";
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			stmt = con.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.setString(2, pass);
			stmt.setString(3, name);
			stmt.setString(4, addr);
			stmt.setString(5, deptno);
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
