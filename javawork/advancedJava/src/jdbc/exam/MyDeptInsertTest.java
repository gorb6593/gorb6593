package jdbc.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MyDeptInsertTest {
	public static void main(String[] args) {
		MyDeptDAO1 dao = new MyDeptDAO1();
		Scanner key = new Scanner(System.in);
		System.out.print("�μ���ȣ:");
		int deptno = key.nextInt();
		System.out.print("�μ���:");
		String deptname = key.next();	
		MyDeptDTO dept = new MyDeptDTO(deptno, deptname);
		dao.insert(dept);
	}
}




