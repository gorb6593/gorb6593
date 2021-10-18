package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//API���� �����Ǵ� Ŭ������ ����ϴ� ��� �߻��ϴ� ���� ó��
public class ExceptionTest05 {
	public static void main(String[] args) {		
		//FileReader�� FileNotFoundException�� throws�ϰ� �ִٴ� ���� ���ο��� ���ܸ� ���� ó������ �ʰ� ȣ���ϴ� ������ ���ܸ�
		//ó���϶�� �ǹ�
		try {
			FileReader fr = new FileReader("test.txt");
			System.out.println(fr.read());//IOException�� �߻��ǹǷ� ó���ؾ� �Ѵ�.
		}catch(FileNotFoundException e){
			System.out.println("�ش� ������ ã�� �� �����ϴ�.");
			//���ϸ��� Ʋ�� ��� ó���ؾ� �ϴ� �ڵ带 ���
		}catch(IOException e) {
			System.out.println("������ ���� �� �����ϴ�.");
		}
	}
}
