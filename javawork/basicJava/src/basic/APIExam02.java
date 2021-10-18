package basic;

import java.util.Random;

public class APIExam02 {
	public static void main(String[] args) {
		//Random클래스의 nextInt()메소드를 호출하여 랜덤수를 다음과 같은 출력형태로 출력하세요.
		// - Random클래스 참조변수 : rand
		//[출력형태]
		//랜덤수:___
		Random rand = new Random();
		int result = rand.nextInt();
		System.out.println("랜덤수:"+result);
		
		//1부터 100까지 랜덤수를 출력
		//[출력형태]
		//랜덤수:___
		//nextInt(숫자)
		//0은 포함, 사용자가 입력한 숫자는 포함되지 않는다.
		Random rand2 = new Random();
		int result2 = rand2.nextInt(100);
		System.out.println("랜덤수:"+result2);
	
	}

}
