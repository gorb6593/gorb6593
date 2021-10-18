package statement;
//While문과 do~while문의 차이점
public class DoWhileTest {
	public static void main(String[] args) {
		int num=10;
		while(num<10) {
			//while문을 쓰는 경우 조건을 만족하지 않으면 블럭안에 코드가 한 번도 실행되지 않는다.
			System.out.println("while을 사용하는 경우 자바프로그램밍:"+num);
			num++;
		}
		//조건 판단하는 구문이 블럭 안에 있어야하는 상황
		num=10;
		do {
			System.out.println("while을 사용하는 경우 자바프로그램밍:"+num);
			num++;
		}while(num<10);
	}

}
