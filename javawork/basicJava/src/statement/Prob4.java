package statement;

import java.util.Scanner;

public class Prob4 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("1���� ũ�� 10���� ���� ������ �Է��ϼ���. :");
		int a = key.nextInt();
		int fac = 1;
		if(a >=2 & a <=9) {
			for(int b=1;b<=a;b++) {
				fac = fac * b;
				System.out.println(b+"!="+fac);
			}
		}else {
		System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
	}
}
}