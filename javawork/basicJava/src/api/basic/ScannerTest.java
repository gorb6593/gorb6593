package api.basic;

import java.util.Scanner;

//ScaanerŬ������ �⺻ ����� => ���� �Է��� ���� �����͸� ��
//==> ǥ���Է����� �Էµ� ���� �о �����ϴ� ����� ������ �ִ� API�� Ŭ����
//ǥ���Է� System.in Ű����� �Է�
//ǥ����� System.out
public class ScannerTest {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Ű���带 �̿��ؼ� ������ �Է��غ�����:");
		//��ü ������ �о ����
		String line = key.nextLine();
		System.out.println("����ڰ� �Է��� ����=>"+line);
		
		//�ܾ��б�
		//=> spacebar�� enterŰ�� �ԷµǱ� ������ �Է��� �ܾ �о ����
		String data = key.next();
		System.out.println("�Է¹��� �ܾ�=>"+data);
		//�����б�
		int num = key.nextInt();
		System.out.println("�Է¹��� ����=>"+num);
		//�Ǽ��б�
		double doubleVal = key.nextDouble();
		System.out.println("�Է¹��� �Ǽ�=>"+doubleVal);
	}

}
