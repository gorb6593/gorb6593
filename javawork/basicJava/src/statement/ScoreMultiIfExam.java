package statement;

import java.util.Scanner;

public class ScoreSwitchExam {
	public static void main(String[] args) {
		//���� if, if���� ��ø
		//0~59 : F����
		//60~69: D����
		//70~79: C����
		//80~89: B����
		//90~100: A����
		//110 or -40: �߸��Է�
		//[�������]
		//����:__
		//__����
		//ScannerŬ������ �̿��ؼ� �Է¹޵���
		//0���� 100���� �ԷµǸ� ������, ���� ���ڴ� �߸��Է����� ��µǵ��� ����
		Scanner key = new Scanner(System.in);
		System.out.println("�����Է�:");
		int jumsu = key.nextInt();
		if(jumsu<0 | jumsu>100) {
		}else {
			if(jumsu>90) {
				System.out.println("A����");
			}else if(jumsu>=80) {
				System.out.println("B����");
			}else if(jumsu>=70) {
				System.out.println("C����");
			}else if(jumsu>=60) {
				System.out.println("D����");
			}else {
				System.out.println("F����");
			}
		}
	}

}
