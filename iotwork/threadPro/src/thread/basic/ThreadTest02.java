package thread.basic;

class DigitThread1 extends Thread{
	DigitThread1(String name){
		super(name);
	}
	@Override
	public void run() {
		//1���� 20���� ����ϴ� �ڵ�
		for (int i = 1; i <= 20; i++) {
			System.out.print(i+"("+getName()+")");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(i%5==0) {
				System.out.println();
			}
		}
	}
}
class AlphaThread1 extends Thread{
	AlphaThread1(String name){
		super(name);
	}
	@Override
	public void run() {
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadTest02 {
	public static void main(String[] args) {
		System.out.println("����");		
		DigitThread1 a1 = new DigitThread1("a1");
		AlphaThread1 d1 = new AlphaThread1("d1");
		a1.start();
		d1.start();
		System.out.println("����");
		for (int i = 1; i <= 10; i++) {
			System.out.println("main"+i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}