package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//finally블럭 - 무조건 실행될 명령문을 정의할때 사용
public class ExceptionTest04 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		try {
			//예외발생 가능성이 있는 코드		
			System.out.println("start");
			System.out.println("숫자를 입력하세요:");
			int num = key.nextInt();
			System.out.println("나눌 숫자를 입력하세요");
			int num2 = key.nextInt();
			System.out.println("결과:"+(num/num2));
			//System.out.println(args[0]);
			System.out.println("다른작업의처리");
			System.out.println("end - 정상종료");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누었습니다. 다시 입력하세요.");
		}catch(InputMismatchException e) {
			System.out.println("숫자를 입력해야 합니다. 문자를 입력했습니다. 다시 확인해주세요.");
		}catch(Exception e) {
			//예외처리
			System.out.println("기타 처리하지 못한 오류가 발생한 경우");
		}finally {
			//예외상황이나 정상처리상황 모두 반드시 실행해야 하는 코드를 정의하는 곳
			System.out.println("=========자원반납============");
		}
	}
}
