package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class PreparedStatementSelectTest {
	public static void main(String[] args) {
		//PreparedStatementSelectTest obj = new PreparedStatementSelectTest();
		MemberDAO dao = new MemberDAO();
		Scanner key = new Scanner(System.in);
		System.out.println();
		
		//dao.select();
		ArrayList<MemberDTO> userlist = dao.getMemberList();
		for(int i =0;i<userlist.size();i++) {
			MemberDTO user = userlist.get(i);
			System.out.print(user.getId()+",");
			System.out.print(user.getPass()+",");
			System.out.print(user.getName()+",");
			System.out.print(user.getAddr()+",");
			System.out.print(user.getPoint()+",");
			System.out.println(user.getDeptno()+",");
		}
		
	}
	
	
	
	
	
	
	
	
	public void select() {
		String url = "jdbc:oracle:thin:@221.161.111.20:1521:xe";
		String user = "scott";
		String password = "tiger";
		StringBuffer sql = new StringBuffer();
		sql.append("select * from member");
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			stmt =  con.prepareStatement(sql.toString());
			rs = stmt.executeQuery();
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
