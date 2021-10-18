package oop.basic;
//MyMethod클래스에 정의된 메소드를 호출
public class MyMethodTest {
	public static void main(String[] args) {		
		MyMethod m = new MyMethod();
		System.out.println("업무시작");
		System.out.println("작업1");
		//1. 메소드의 호출 - 매개변수가 없고 리턴값이 없는 메소드의 호출
		m.display();
		
		System.out.println("작업2");
		m.display();
		
		System.out.println("작업3");
		m.display();
		m.display();
		//2. 매개변수가 있고 리턴값이 없는 메소드의 호출
		
		//매개변수 한 개
		m.display("★");//출력하고 싶은 특수문자를 매개변수로 전달
		m.display("◈");
		m.display("♡");
		
		//매개변수 2개
		m.display("♣", 20);
		m.display("♣", 2);
		m.display("♣", 60);
		m.display("※", 50);
		
		//3. 매개변수가 있고 리턴값이 있는 메소드를 호출
		//=> 전달되는 리턴값을 사용하지 않아서 변화가 없다.
		//   리턴값이 있는 메소드를 호출하는 경우 리턴타입과 같은 변수를 선언하고 전달되는 값이 할당되도록 한다.
		int result = m.add(100, 200);
		System.out.println("add메소드 호출결과=>"+result);
		if(result>100) {
			System.out.println("크다.");
		}else {
			System.out.println("작다.");
		}
		//2) 다른 메소드의 매개변수로 메소드의 리턴값을 바로 전달할 수 있다.
		System.out.println(m.add(300, 500));
		// System.out.println(m.display()); //리턴타입이 void인 메소드는 다른 메소드의 매개변수로 전달할 수 없다.
	}
}
