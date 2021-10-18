package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MyDeptUpdateTest {
	public static void main(String[] args) {
		MyDeptDAO dao = new MyDeptDAO();
		Scanner key = new Scanner(System.in);
		System.out.print("부서번호:");
		String deptno = key.next();
		System.out.print("위치:");
		String loc = key.next();
		dao.update(deptno,loc);
	}
}




