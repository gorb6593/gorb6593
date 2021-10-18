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
		sql = sql+"set addr='����' ";
		sql=sql+"where id='jang'";
		Connection con = null;
		Statement stmt = null;
		try {
			//1. ����̹��ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹��ε�����!!");
			//2. DB������ Ŀ�ؼ�
			con = DriverManager.getConnection(url, user, password);
			System.out.println("Ŀ�ؼǼ���!!"+ con);
			//3. SQL�� �����ϴ� ����� ���� �ִ� ��ü Statement����
			stmt =  con.createStatement();
			System.out.println("Statement��ü ���� �Ϸ�"+stmt);
			//4. SQL����
			int result = stmt.executeUpdate(sql);
			System.out.println(result+"�� �� ��������!!!!!!!!!!!!!");
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




