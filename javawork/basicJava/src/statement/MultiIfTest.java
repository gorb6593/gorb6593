package statement;

import java.util.Scanner;

public class MultiIfTest {

	public static void main(String[] args) {
		//Scanner로 주민번호 7번째 자리 값을 입력받아서 처리
		Scanner key = new Scanner(System.in);
		System.out.println("주민번호입력:");
		int ssn = key.nextInt();
		System.out.println(ssn);
		if(ssn==1 | ssn==3) {
			System.out.println("남자");
		}else if(ssn==2 | ssn==4) {
			System.out.println("여자");
		}else {
			System.out.println("기타");
		}
	}

}
