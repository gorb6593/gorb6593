package practice;
public class practice01 {
// p.165
	public static void main(String[] args) {
		Tv t;//Tv��� Ŭ������ ���� �����߰� Tv��� Ŭ������ ���������� t��� ����
		t = new Tv(); // Tv��� �ν��Ͻ��� ����  new��� �����ڿ� ���� TvŬ������ �ν��Ͻ��� �޸��� �� ������ ����
		t.channel = 7; // �������� t�� �����, Tv�ν��Ͻ��� ������� channel�� ���� 7�� ����
		t.channelDown(); // Tv�ν��Ͻ��� �޼����� �ϳ��� channelDown�� ����
		System.out.println("���� ä����"+t.channel+"�Դϴ�.");
	}
}  

class Tv{  
	String color; // color�� �����̹Ƿ� String���� ����
	boolean power; // power�� on/off, ��or���������̱⿡ boolean���� ����
	int channel; // channel�� ������ int�� ����
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

//���� 1. 13�� �̰� Ŭ������ �����Ѱǰ���? Ŭ������ �����Ѵٴ� ������ ���ذ� �ȵ˴ϴ�
//���� 2. 17���� void ���� power �ڿ� ()�� �ǹ̰� ���ذ� �ȵ˴ϴ�.
//���� 3. �̷��� �Ǹ� 13�� �ٺ��� 20��° ���� ���� ���� �νĵǾ ä���� 1 down�� 6�� �ԷµǴ� �ǰ���?
//���� 4. 6,8���� Tv �ڿ� ()�� �ǹ�