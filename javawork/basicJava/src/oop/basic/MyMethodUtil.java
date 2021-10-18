package oop.basic;
//main메소드에 정의했던 내용들을 메소드를 작성해서 호출해보는 연습
//메소드만 모아놓은 클래스
public class MyMethodUtil {
	//1. 매개변수로 전달받은 num을 평가해서 합격인지 불합격인지 출력하는 메소드 - 매개변수가 있고 리턴값이 없는 메소드
	public void scoreCheck(int num) {
		if(num>=90) {
			System.out.println("점수:"+num+"(합격)");
		}else {
			System.out.println("점수:"+num+"(재시험)");
		}			
	}
	public int calc(int opr,int num1,int num2) {
		int result = 0;
		switch(opr) {
			case 1:
				result = num1+num2;
				break;
			case 2:
				result = num1*num2;
				break;
			case 3:
				result = num1-num2;
				break;
			case 4:
				result = num1/num2;
				break;
		}
		return result;
	}
	
	//1부터 100까지 짝수를 출력하는 메소드를 정의
	public void printNumber(int dan) {
		for(int i=2;i<=100;i=i+2){
			if(i%2==0) {
				System.out.println("짝수 : "+i);
			}	
		}
	}	
	//입력받는 단을 출력하는 메소드를 정의
	//메소드명 : printGuGu
	public void printGuGu(int dan) {
		for(int i=1;i<=9;i++) {
			System.out.println(dan+"*"+i+"="+(dan*1));
		}
	}
	//1부터 전달받은 숫자까지의 합을 구해 리턴하는 메소드를 정의
	//메소드명 : getHap
	public int getHap(int num) {
		int sum = 0;
		for(int i=1;i<=num;i++) {
			sum = sum+i;			
		}
		return sum;
	}
	//배열의 모든 요소의 홀수합과 짝수합을 구해서 출력하는 메소드
	//매개변수로 기본형, 참조형 모두 전달받을 수 있다.
	//리턴타입으로 기본형, 참조형 모두 리턴할 수 있다.
	public void printArray(int[] myarr, String arrName) {
		int evensum = 0;
		int oddsum = 0;		
		for(int i=0;i<myarr.length;i++) {			
			
			if(myarr[i]%2==0) {
				evensum = evensum + myarr[i];
			}else {
				oddsum = oddsum + myarr[i];
			}
		}
		System.out.println("배열 "+arrName+")");
		System.out.println("홀수의합 : "+oddsum);
		System.out.println("짝수의합 : "+evensum);
	}
}
