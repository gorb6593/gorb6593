package statement;

import java.util.Scanner;

public class javapractice1 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("1���� ũ�� 10���� ���� ������ �Է��ϼ���. :");
		int Dan = key.nextInt();
		if(Dan >= 1 & Dan <= 10) {
			for(int i=1;i<10;i++) {	
			System.out.println(Dan+"*"+i+"="+(Dan*i));
		}
		}else{
			System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
		}
	}
}
