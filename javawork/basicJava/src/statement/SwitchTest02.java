package statement;

import java.util.Scanner;

public class SwitchTest02 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("�ֹι�ȣ�Է�:");
		int ssn = key.nextInt();
		switch(ssn) {
		case 1:
			System.out.println("����");
			break;
		case 2:
			System.out.println("����");
			break;
		case 3:
			System.out.println("����");
			break;
		case 4:
			System.out.println("����");
			break;
		default:
		 	System.out.println("��Ÿ");
		}
	}

}