package statement;

import java.util.Scanner;

public class Prob4 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요. :");
		int a = key.nextInt();
		int fac = 1;
		if(a >=2 & a <=9) {
			for(int b=1;b<=a;b++) {
				fac = fac * b;
				System.out.println(b+"!="+fac);
			}
		}else {
		System.out.println("잘못된 숫자가 입력되었습니다.");
	}
}
}