package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//오라클 서버에 접속하기
public class ConnectionTest {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@221.161.111.20:1521:xe";
		String user = "scott";
		String password = "tiger";
		try {
			//1. JDBC드라이버를 로딩 - 오라클
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버로딩성공!!");
			//2. DBMS 커넥션
			//오라클인 경우 con 참조변수의 타입은 Connection타입으로 설정을 했지만
			//실제 실행시점에 매핑되는 객체타입은 oracle.jdbc.driver.T4CConnection이다. 다형성
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("커넥션성공!!"+ con);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}












