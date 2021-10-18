package oop.inheritance;
//상속관계에 있는 클래스의 멤버변수 특징
//상속관계에서 상위클래스에 선언된 멤버변수를 하위클래스에서 접근이 가능하다.
//상위클래스에서 선언된 변수와 동일한 이름의 변수가 하위클래스에 선언되어 있다면 부모클래스의 멤버변수보다 하위클래스의 멤버변수가 우선순위가 높다.
//자식클래스의 멤버변수를 인식
//하위클래스에서 상위클래스의 동일한 이름을 갖는 멤버를 접근하고 싶은 경우에는 super라는 키워드를 이용해서 접근
//this => 자기자신의 객체
//super => 부모객체
//상속관계에 있어도 부모의 private멤번믄 하위클래스에서 접근할 수 없다.

class Super{
	int num = 100;
}
class Sub extends Super{
	int num = 1000;
	public void display() {
		System.out.println("num=>"+num);
		System.out.println("부모클래스의 num=>"+super.num); //4번의 테스트코드
	}
}
public class InheritanceTest01 {
	public static void main(String[] args) {
		//클래스 내부에서 객체를 생성하고 사용하는 클래스는 언제나 하위클래스이다.
		Sub obj = new Sub();
		System.out.println(obj.num); //1번 테스트코드
	}
}
