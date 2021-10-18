package array;

import java.util.Random;

//참조형배열의 사용
public class ArrayTest03 {
	public static void main(String[] args) {
		//int형 배열 - int값을 저장하기 위한 변수 두 개를 배열로 정의
		int[] intArr = new int[2];
		intArr[0] = 100;
		intArr[1] = 200;
		
		//String형 배열 - String변수는 원래 heap에 할당된 객체의 주소를 저장하는 변수
		//				따라서 String 배열은 String객체를 참조하는 변수 3개를 배열로 정의
		//				참조형배열은 참조형변수 여러 개를 배열로 정의
		String[] strArr = new String[3];
		strArr[0] = new String("java");
		strArr[1] = new String("jsp");
		strArr[2] = new String("spring");
		
		//Random형 배열
		Random[] randArr = new Random[3];
		//Random객체를 randArr의 각 요소에 할당하기
		//1번 index의 요소를 출력하기
		randArr[0] = new Random();
		randArr[1] = new Random();
		randArr[2] = new Random();
		System.out.println(randArr[0]);
		System.out.println(randArr[1]);
		System.out.println(randArr[2]);
		
		
	}

}
