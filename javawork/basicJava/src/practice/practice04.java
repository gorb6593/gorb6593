package practice;
//p.61
import java.util.Scanner;

public class practice04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���ڸ� ������ �ϳ� �Է����ּ���.>");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		System.out.println("�Է³��� :"+input);
		System.out.println("num = "+num);
	}
}

//���� 1. 9���� �Է¹�����scanner.nextLine()�� input�� �����ϴ� �ǰ���? Ű����� �Է¹��� ���� scanner.nextLine()��� �����ϸ� �ǳ���?



//���� 1. int x = 1;
//		String str = "abcd"
//		String name = new String("Java")
//		String name = "java"
//���� 2. p114. ����
