package statement;
//while문 사용방법
public class WhileTest01 {
	public static void main(String[] args) {
		//잡프로그래밍 문자열을 5번 출력
		int i = 1;
		while(i<=5) {
			System.out.println("자바프로그래밍");
			i++;
		}
		System.out.println("==================");
		i=1;//i변수를 재정의
		while(true) {//무한루프
			if(i>5) {
					//while블럭을 빠져나가기
					break;
			}
			System.out.println("자바프로그래밍"+i);
			i++;
		}
	}
}
