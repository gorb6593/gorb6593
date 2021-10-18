package jdbc.exam;

import java.util.Scanner;

public class MyDeptDeleteTest {
	public static void main(String[] args) {
		MyDeptDAO dao = new MyDeptDAO();
		Scanner key = new Scanner(System.in);
		System.out.print("부서번호:");
		String deptno = key.next();
		dao.delete(deptno);
	}
}




