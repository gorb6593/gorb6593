package statement;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("1���� ũ�� 10���� ���� ������ �Է��ϼ���. :");
		int dan = a.nextInt();		
		if(dan >=2 & dan <=9) {
			for(int i=1;i<=9;i++) {
				System.out.println(dan+"*"+i+"="+(dan*i));
			}
		}else {
			System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
		}	
	}
}
