package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

//throws�� �̿��ؼ� ����ó���� ȣ���ϴ� ������ �ѱ��
public class ThrowsTest01 {	
		//1. ���ܰ� �߻��ϴ� ������ ���� ó���ϱ�
		public void test(String fileName) {
			try {
				FileReader fr = new FileReader(fileName);
			}catch(FileNotFoundException e) {
				System.out.println("����ó�� �Ϸ�...");
			}
		}
		//==> ���ܰ� �߻��ϴ� ������ ó������ �ʰ� ȣ���ϴ� ������ ���ܸ� ó���� �� �ֵ��� ����
		public static void main(String[] args) {
			ThrowsTest01 obj = new ThrowsTest01();
			//1. ���ܰ� �̸� ó���� �޼ҵ带 ȣ��
			//test�޼ҵ带 ȣ���ϴ� �������� ���ܰ� �߻��ߴ��� �� �� ����.
			//���ܿ� ���� ó���� ��� ����
			obj.test("test1.txt");//A��ġ���� �޼ҵ带 ȣ���ߴٰ� ����
			obj.test("test2.txt");//B��ġ���� �޼ҵ带 ȣ���ߴٰ� ����
	}
}
