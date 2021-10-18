package statement;


import java.util.Scanner;

public class IfExam01 {

	public static void main(String[] args) {
		// 랜덤수를 발생시키고 0, 음수, 양수를 판별해서 출력
		//ex) 2144 => 양수
		//ex) -4567=> 음수
		//ex) 0 => 0
		//[출력형태]
		//____=>_____
		/*
		 * Random rand = new Random(); int randVal = rand.nextInt();
		 */
		//Scanner를 이용해서 작업
		Scanner key = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
	
		int randVal = key.nextInt();
		if(randVal<0) {
			System.out.println(randVal + "=>음수");
		}else{
			//조건이 만족하지 않는 경우
			//또 다른 조건을 적용해야 하는 경우
			//양수짝수, 양수음수
			if(randVal%2==0) {
				System.out.println(randVal + "=>양수짝수");
			}else {
				System.out.println(randVal + "=>양수홀수");
			}
		//	if(randVal==0) {
			//	System.out.println(randVal + "=> 0");
		//}else{
			//	System.out.println(randVal + "=> 양수" );
		//	}
		}
	}

}
