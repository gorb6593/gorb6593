package oop.inheritance;

//��Ӱ��迡�� Ŭ������ ���ǵ� �޼ҵ尡 ���� Ư¡
//����Ŭ������ ���ǵ� �޼ҵ带 ����Ŭ�������γ� ����Ŭ�������������� ���ؼ� ȣ���� �� �ִ�.

class Parent{
	public void display() {
		System.out.println("�θ�Ŭ������ display()");
	}
}
class Child extends Parent{
	public void test() {
		System.out.println("�ڽ�Ŭ������ test()");
		display(); // 1���� �׽�Ʈ�ڵ� - �ڱ��ڽ��� ����� ȣ���ϴ� ���� ���������� ���� ȣ������ �ʰ� �޼ҵ�� �����Ͽ� ȣ���� �� �ִ�.
	}
}
public class InheritanceTest02 {
	public static void main(String[] args) {
		Child obj = new Child();
		obj.display();
		obj.test();

	}

}
