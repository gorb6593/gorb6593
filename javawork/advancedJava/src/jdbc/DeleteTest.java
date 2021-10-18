package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTest {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@221.161.111.20:1521:xe";
		String user = "scott";
		String password = "tiger";
		StringBuffer sql = new StringBuffer();
		sql.append("delete member ");
		sql.append("where id=? ");
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
			//4. SQL���� - toString�޼ҵ带 ȣ���ؼ� StringBuffer�� String���� ��ȯ
			int result = stmt.executeUpdate(sql.toString());
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




