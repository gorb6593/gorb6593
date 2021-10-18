package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

//throws를 이용해서 예외처리를 호출하는 곳으로 넘기기
public class ThrowsTest01 {	
		//1. 예외가 발생하는 곳에서 직접 처리하기
		public void test(String fileName) {
			try {
				FileReader fr = new FileReader(fileName);
			}catch(FileNotFoundException e) {
				System.out.println("예외처리 완료...");
			}
		}
		//==> 예외가 발생하는 곳에서 처리하지 않고 호출하는 곳에서 예외를 처리할 수 있도록 구현
		public static void main(String[] args) {
			ThrowsTest01 obj = new ThrowsTest01();
			//1. 예외가 미리 처리된 메소드를 호출
			//test메소드를 호출하는 곳에서는 예외가 발생했는지 알 수 없다.
			//예외에 대한 처리가 모두 동일
			obj.test("test1.txt");//A위치에서 메소드를 호출했다고 가정
			obj.test("test2.txt");//B위치에서 메소드를 호출했다고 가정
	}
}
