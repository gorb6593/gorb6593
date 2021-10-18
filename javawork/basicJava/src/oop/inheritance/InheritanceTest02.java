package oop.inheritance;

//상속관계에서 클래스에 정의된 메소드가 갖는 특징
//상위클래스에 정의된 메소드를 하위클래스내부나 하위클래스참조변수를 통해서 호추할 수 있다.

class Parent{
	public void display() {
		System.out.println("부모클래스의 display()");
	}
}
class Child extends Parent{
	public void test() {
		System.out.println("자식클래스의 test()");
		display(); // 1번의 테스트코드 - 자기자신의 멤버를 호출하는 경우는 참조변수를 통해 호출하지 않고 메소드명 정의하여 호출할 수 있다.
	}
}
public class InheritanceTest02 {
	public static void main(String[] args) {
		Child obj = new Child();
		obj.display();
		obj.test();

	}

}
