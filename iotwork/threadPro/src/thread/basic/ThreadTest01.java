package thread.basic;

class ThreadDemo01 extends Thread{
	ThreadDemo01(String name){
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

public class ThreadTest01 {
	public static void main(String[] args) {
		System.out.println("*****���α׷�����*****");
		ThreadDemo01 t1 = new ThreadDemo01("t1");
		ThreadDemo01 t2 = new ThreadDemo01("t2");
		//t1.run(); => �޼ҵ�ȣ��(���������α׷��� x)
		t1.start();
		t2.start();
		for (int i = 1; i <= 10; i++) {
			System.out.println("main"+i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("*****���α׷�����*****");
	}
}