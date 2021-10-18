package practice;
//p.61
import java.util.Scanner;

public class practice04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("두자리 정수를 하나 입력해주세요.>");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		System.out.println("입력내용 :"+input);
		System.out.println("num = "+num);
	}
}

//질문 1. 9줄은 입력받은값scanner.nextLine()을 input에 저장하는 건가요? 키보드로 입력받을 값이 scanner.nextLine()라고 이해하면 되나요?



//질문 1. int x = 1;
//		String str = "abcd"
//		String name = new String("Java")
//		String name = "java"
//질문 2. p114. 문제
