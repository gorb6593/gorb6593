package statement;

//자바에서 로컬(local)변수의 특징
// - {}(블럭) 내부에서 선언되는 변수를 모두 로컬변수라 한다. 단, 클래스 선언부에 선언되는 변수는 제외
// - 자바에서는 전역변수의 개념은 없다.
//
public class LocalVariableTest {
	int i = 0; //로컬변수 아님
	public static void main(String[] args) {
		int j = 10; //로컬변수
		//1. 로컬변수는 사용하기 전에 반드시 초기화(값을 =연산자로 할당)해야 한다.
		int num;
		//System.out.println("로컬변수=>"+num);
		int val = 0; //정수형변수는 0으로 초기값을 정의한다.
		if(j>=10) {
			val = 100; //로컬변수
			//int j = 100;
		 	System.out.println("val="+val);
		}else {
			for(int k=0;k<=10;k++) {//k는 for블럭 안에서 선언된 변수와 같으므로 로컬변수
				System.out.println(k);
			}
		}
		//2. 로컬변수는 선언된 블럭 내부에서만 사용할 수 있다.
		//   블럭이 끝나면 메모리에서 해제된다.
		System.out.println("val의 값=>"+val);

	}

}
