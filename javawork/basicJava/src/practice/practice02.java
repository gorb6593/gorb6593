package practice;
//p.168
public class practice02 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1�� ���� "+ t1.channel + "�Դϴ�.");
		System.out.println("t2�� ���� "+ t2.channel + "�Դϴ�.");
		
		t1.channel = 7;
		System.out.println("t1�� channel���� 7�� �����Ͽ����ϴ�.");
		
		System.out.println("t1�� channel ���� "+ t1.channel+ "�Դϴ�.");
		System.out.println("t2�� channel ���� "+ t2.channel+ "�Դϴ�.");
	}
}


// ���� 1. Tv t1, t2�� �����Ѱ��� ���µ� ���� class�� �����Ѱ� ���⵵ �ش�Ǵ� �ǰ���?
// ���� 2. �ȴٸ� Tv��� �ν��Ͻ��� ���� t2��� ���������� Tv�� �޼��带 �̿��ϴ� �ǰ���?