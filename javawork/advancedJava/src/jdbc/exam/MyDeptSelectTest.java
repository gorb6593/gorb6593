package jdbc.exam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MyDeptDeleteTest {
	public static void main(String[] args) {
		MyDeptDAO dao = new MyDeptDAO();
		dao.select();
	}
}




