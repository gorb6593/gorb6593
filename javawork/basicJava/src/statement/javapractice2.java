package statement;

import java.util.Scanner;

public class javapractice2 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("2~100������ ������ �Է��ϼ���:");
		int num = key.nextInt();
		int count = 0;//����� ������ �����ϴ� ����
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count>2) {
			System.out.println(num+"��(��) �Ҽ��� �ƴմϴ�..");
		}else{
			System.out.println(num+"��(��) �Ҽ��Դϴ�.");
		}
	}
}


