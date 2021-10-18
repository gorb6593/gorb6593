package oop.inheritance;
//��Ӱ��迡 �ִ� Ŭ������ ������� Ư¡
//��Ӱ��迡�� ����Ŭ������ ����� ��������� ����Ŭ�������� ������ �����ϴ�.
//����Ŭ�������� ����� ������ ������ �̸��� ������ ����Ŭ������ ����Ǿ� �ִٸ� �θ�Ŭ������ ����������� ����Ŭ������ ��������� �켱������ ����.
//�ڽ�Ŭ������ ��������� �ν�
//����Ŭ�������� ����Ŭ������ ������ �̸��� ���� ����� �����ϰ� ���� ��쿡�� super��� Ű���带 �̿��ؼ� ����
//this => �ڱ��ڽ��� ��ü
//super => �θ�ü
//��Ӱ��迡 �־ �θ��� private����� ����Ŭ�������� ������ �� ����.

class Super{
	int num = 100;
}
class Sub extends Super{
	int num = 1000;
	public void display() {
		System.out.println("num=>"+num);
		System.out.println("�θ�Ŭ������ num=>"+super.num); //4���� �׽�Ʈ�ڵ�
	}
}
public class InheritanceTest01 {
	public static void main(String[] args) {
		//Ŭ���� ���ο��� ��ü�� �����ϰ� ����ϴ� Ŭ������ ������ ����Ŭ�����̴�.
		Sub obj = new Sub();
		System.out.println(obj.num); //1�� �׽�Ʈ�ڵ�
	}
}
