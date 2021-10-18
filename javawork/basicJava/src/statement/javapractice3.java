package statement;

import java.util.Scanner;

public class javapractice3 {

	public static void main(String[] args) {
			Scanner key = new Scanner(System.in); 
			System.out.println("초기값을 정수로 입력하세요.:");
			int val1 = key.nextInt();
			System.out.println("마지막 값을 정수로 입력하세요.: ");
			int val2 = key.nextInt();
			System.out.println("증가분을 정수로 입력하세요.:");
			int val3 = key.nextInt();
			int hap = 0;//합계를 저장할 변수
			for(int i=val1;i<=val2;i=i+val3) {
				hap = hap+i;
			}
			System.out.println("총합은"+hap+"입니다.");
	}
}
