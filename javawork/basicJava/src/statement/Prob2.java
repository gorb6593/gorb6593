package statement;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요. :");
		int dan = a.nextInt();		
		if(dan >=2 & dan <=9) {
			for(int i=1;i<=9;i++) {
				System.out.println(dan+"*"+i+"="+(dan*i));
			}
		}else {
			System.out.println("잘못된 숫자가 입력되었습니다.");
		}	
	}
}
