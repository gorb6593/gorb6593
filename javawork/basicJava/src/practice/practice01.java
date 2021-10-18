package practice;
public class practice01 {
// p.165
	public static void main(String[] args) {
		Tv t;//Tv라는 클래스를 새로 정의했고 Tv라는 클래스의 참조변수를 t라고 설정
		t = new Tv(); // Tv라는 인스턴스를 생성  new라는 연산자에 의해 Tv클래스의 인스턴스가 메모리의 빈 공간에 생성
		t.channel = 7; // 참조변수 t에 저장된, Tv인스턴스의 멤버변수 channel의 값을 7로 설정
		t.channelDown(); // Tv인스턴스의 메서드중 하나인 channelDown를 설정
		System.out.println("현재 채널은"+t.channel+"입니다.");
	}
}  

class Tv{  
	String color; // color는 문자이므로 String으로 정의
	boolean power; // power는 on/off, 참or거짓형태이기에 boolean으로 정의
	int channel; // channel은 정수형 int로 정의
	void power() { 
			power = !power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}

//질문 1. 13줄 이게 클래스를 설정한건가요? 클래스를 설정한다는 개념이 이해가 안됩니다
//질문 2. 17번줄 void 부터 power 뒤에 ()의 의미가 이해가 안됩니다.
//질문 3. 이렇게 되면 13번 줄부터 20번째 줄이 가장 먼저 인식되어서 채널이 1 down된 6이 입력되는 건가요?
//질문 4. 6,8번줄 Tv 뒤에 ()의 의미