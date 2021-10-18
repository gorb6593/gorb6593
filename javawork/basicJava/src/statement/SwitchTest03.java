package statement;
//switch의 특성 - case로 평가할 값의 타입
public class SwitchTest03 {
	public static void main(String[] args) {
		//switch의 평가 변수는 int로 변환이 가능한 타입만 사용할 수 있다.
		/*
		 * long d = 10L;
		 * switch(d) { case 1.0: System.out.println("테스트"); }
		 */
		int data=5;
		switch(data+60) {
			case 'A' : //char가 int로 자동캐스팅이 되므로 정상실행이 가능
				System.out.println("A");
				break;
			case 'B' : //char가 int로 자동캐스팅이 되므로 정상실행이 가능
				System.out.println("B");
				break;
		}
		String code = new String("Ao1");
		switch(code) {
		case "A01" :
			System.out.println("A01");
			break;
		case "A02" :
			System.out.println("A02");
			break;
		}
	}
}
