package statement;

import java.util.Scanner;

public class javapractice1 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요. :");
		int Dan = key.nextInt();
		if(Dan >= 1 & Dan <= 10) {
			for(int i=1;i<10;i++) {	
			System.out.println(Dan+"*"+i+"="+(Dan*i));
		}
		}else{
			System.out.println("잘못된 숫자가 입력되었습니다.");
		}
	}
}
