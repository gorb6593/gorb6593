package array;

import java.util.Random;
import java.util.Scanner;

public class ArrayHomeExam01 {
	public static void main(String[] args) {
		/*
		 * int형 배열을 선언하고 아래와 같은 조건이 만족할 수 있도록 작업
		 * 1. int형 데이터 5개를 저장할 수 있도록 ㅈ이
		 * 2. Random값(1부터 50까지의 값)을 배열변수의 각 요소에 저장하기(Scanner로 입력 받아서 저장해도 좋음)
		 * 3. 배열 요소에 저장된 값이 짝수인지 홀수인지 판별하여 출력하기
		 * 
		 * [출력형태] - Random
		 * 랜덤수로 25저장 -> 홀수
		 * 랜덤수로 42저장 -> 짝수
		 * 랜덤수로 33저장 -> 홀수
		 * 
		 * [출력형태] - Scanner
		 * 배열요소에 저장될 값 : _____
		 * 배열요소에 저장될 값 : _____
		 * 배열요소에 저장될 값 : _____
		 * 배열요소에 저장될 값 : _____
		 * 배열요소에 저장될 값 : _____
		 * 랜덤수로 25저장 -> 홀수
		 * 랜덤수로 42저장 -> 짝수
		 * 랜덤수로 33저장 -> 홀수
		 */
		int[] myarr = new int[5];
		Random rand = new Random();
		//Scanner key = new Scanner(System.in);
		//배열에 데이터를 저장하기 위한 for문
		for(int i=0;i<myarr.length;i++) {
			myarr[i] = rand.nextInt(50+1);			
			if(myarr[i]%2==0) {
				System.out.println("랜덤수로 :"+myarr[i]+"저장 -> 짝수");
			}else {
				System.out.println("랜덤수로 :"+myarr[i]+"저장 -> 홀수");
			}
		}
	}
}
