package array;
//기본형 배열의 선언, 생성, 초기화 연습
public class ArrayExam01 {
	public static void main(String[] args) {
		//int형 배열변수 myarr을 선언하고 100,200,300을
		//각 요소에 할당하고 2번 index를 갖는 요소의 값을 출력하기
		int[] myarr;
		myarr = new int[3];
		myarr[0] = 100;
		myarr[1] = 200;
		myarr[2] = 300;
		System.out.println(myarr[0]);		
		System.out.println(myarr[1]);
		System.out.println(myarr[2]);		
		}
}
