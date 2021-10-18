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
			//1. ����̹��ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹��ε�����!!");
			//2. DB������ Ŀ�ؼ�
			con = DriverManager.getConnection(url, user, password);
			System.out.println("Ŀ�ؼǼ���!!"+ con);
			//3. SQL�� �����ϴ� ����� ���� �ִ� ��ü Statement����(ResultSet�� ������ OracleResultSetImpl����)
			stmt =  con.createStatement();
			//4. SQL���� - select��
			rs = stmt.executeQuery(sql.toString());
			System.out.println("��ȸ����-"+rs);
			//5. ��� ó�� -> ResultSet�� ����� �����͸� ������ application���� ���
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
