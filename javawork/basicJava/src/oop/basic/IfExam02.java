package oop.basic;

import java.util.Random;
import java.util.Scanner;

public class IfExam02 {

	public static void main(String[] args) {
		Random rand = new Random();
		/*int gender = rand.nextInt(4)+1;
		int age = rand.nextInt(100)+1;*/
		//Scanner로 변환하기
		Scanner key = new Scanner(System.in);
		System.out.println("성별:");
		int gender = key.nextInt();
		System.out.println("나이:");
		int age = key.nextInt();
		if(gender==1 | gender==3){
			if(age>=20) {
				System.out.println("성인남자"+age+","+gender+")");
			}else{
				System.out.println("청소년남자"+age+","+gender+")");
			}	
		}else{
			if(age>=20) {
				System.out.println("성인여자"+age+","+gender+")");
			}else{
				System.out.println("청소년여자"+age+","+gender+")");
			}
		// 랜덤수 두 개 발생시키기
		//1) 성별코드 1~4까지
		//2) 나이 1~100
		// 성별과 나이를 가지고 판단해서 결과를 출력하기(중첩if를 이용)
		//1) 성인남자 : 성별코드 1.3 나이 20세이상
		//2) 성인여자 : 성별코드 2,4 나이 20세이상
		//3) 청소년여자 : 성별코드 2,4 나이 20세 미만
		//4) 청소년남자 : 성별코드 1,3 나이 20세 미만	
		//[출력형태]
		//성인남자(22,1)
		}
	}
}
