package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//예외처리구문, - try ~catch ~catch...
//=> catch블럭을 다중으로 선언하고 사용
//=> 예외의 종류에 따라서 다양한 방법으로 예외를 처리하도록 구현할 수 있다.
public class ExceptionTest03 {
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
		
		}
	}
}
