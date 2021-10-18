package jdbc;
//DBMS�� �ڿ��� �������ϴ� ������ ����� ���ǵ� Ŭ����
// -> DB����, ����̹��ε�, �ڿ��ݳ�, Ʈ�����ó�� ...

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	//����̹��ε�
	//�ý��� ������ Ŭ������ ���Ǹ� �޸𸮿� �ε��ɶ� static{}�ȿ� �޼ҵ尡 �ڵ����� �ε�
	//=> �޼ҵ帶�� ����̹��ε��ϴ� �۾��� �������� �ʰ� Ŭ�����δ��� �۾�Ŭ������ �ε��Ҷ�
	//	 ��ü �ý��ۿ��� �� ���� ����ǵ��� �۾��ϱ� ���� static���ȿ� �ڵ带 �ۼ�
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}
	}
	//Ŀ�ؼ��ϱ� - Ŀ�ؼ��ϴ� �۾��� ��� DB���� �۾��� �Ҷ� ������ �ʿ��� ���
	//		    ��� DB���� �޼ҵ忡�� getConnect�� ȣ���ؼ� DBMS�� ������ �ϰ� �۾��� �ؾ� �ϱ� ������
	//			�� �޼ҵ带 ȣ���ϴ� ������ Ŀ�ؼǰ��Ը� �޾ƾ��Ѵ�. ���� �����ؾ� �Ѵ�.
	//			=> ��û�� ������ DB�� �����ϰ� ���������� Ŀ�ؼǰ�ü�� ���� �����ϴ� �޼ҵ�
	public static Connection getConnect() {
		String url = "jdbc:oracle:thin:@221.161.111.20:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "insert into member values(?,?,?,?,1000,?)";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, password);
		}catch (SQLException e){
			e.printStackTrace();
		}
		return con;
	}
	public static  void  close(ResultSet rs, Statement stmt, Connection con) {
		try{
			   if(rs!=null) rs.close();
			   if(stmt!=null) stmt.close();
			   if(con!=null) con.close();
			}catch(SQLException  e){
			    e.printStackTrace();
			}
	}
	//�ڿ��ݳ�	
}

