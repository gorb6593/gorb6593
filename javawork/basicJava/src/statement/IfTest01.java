package statement;

import java.util.Random;
//if~else ����
public class IfTest01 {

	public static void main(String[] args) {
		//num������ 1���� 100������ �������� �߻���Ű�� 90�̻��̸� �հ����
		//�������� ��������� ����ϱ�
		//[�������]
		//����:____(_____)
		//ex) ����:89(�����)
		//	  ����:93(�հ�)
		Random rand = new Random();
		int num = rand.nextInt(100)+1;
		if(num>=90) {
			System.out.println("����:"+num+"(�հ�)");
		}else {
			System.out.println("����:"+num+"(�����)");
		}
	}
}
