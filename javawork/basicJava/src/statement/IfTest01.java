package statement;

import java.util.Random;
//if~else 연습
public class IfTest01 {

	public static void main(String[] args) {
		//num변수에 1부터 100까지의 랜덤수를 발생시키고 90이상이면 합격출력
		//나머지는 재시험으로 출력하기
		//[출력형태]
		//점수:____(_____)
		//ex) 점수:89(재시험)
		//	  점수:93(합격)
		Random rand = new Random();
		int num = rand.nextInt(100)+1;
		if(num>=90) {
			System.out.println("점수:"+num+"(합격)");
		}else {
			System.out.println("점수:"+num+"(재시험)");
		}
	}
}
