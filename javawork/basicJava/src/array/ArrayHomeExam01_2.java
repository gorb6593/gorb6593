package array;

import java.util.Scanner;

public class ArrayHomeExam01_2 {

	public static void main(String[] args) {
		int[] myarr = new int[5];
		Scanner key = new Scanner(System.in);
		for(int i=0;i<myarr.length;i++) {
			System.out.println("�迭��ҿ� ����� ��:");
			myarr[i] = key.nextInt();
		}
		for(int i=0;i<myarr.length;i++) {
			if(myarr[i]%2==0) {
				System.out.println("�������� :"+myarr[i]+"���� -> ¦��");
			}else {
				System.out.println("�������� :"+myarr[i]+"���� -> Ȧ��");
			}			
		}
	}
}