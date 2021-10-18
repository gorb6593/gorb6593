package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//����Ŭ ������ �����ϱ�
public class ConnectionTest {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@221.161.111.20:1521:xe";
		String user = "scott";
		String password = "tiger";
		try {
			//1. JDBC����̹��� �ε� - ����Ŭ
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹��ε�����!!");
			//2. DBMS Ŀ�ؼ�
			//����Ŭ�� ��� con ���������� Ÿ���� ConnectionŸ������ ������ ������
			//���� ��������� ���εǴ� ��üŸ���� oracle.jdbc.driver.T4CConnection�̴�. ������
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("Ŀ�ؼǼ���!!"+ con);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}












