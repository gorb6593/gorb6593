package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//API에서 제공되는 클래스를 사용하는 경우 발생하는 예외 처리
public class ExceptionTest05 {
	public static void main(String[] args) {		
		//FileReader가 FileNotFoundException을 throws하고 있다는 것은 내부에서 예외를 직접 처리하지 않고 호출하는 곳에서 예외를
		//처리하라는 의미
		try {
			FileReader fr = new FileReader("test.txt");
			System.out.println(fr.read());//IOException이 발생되므로 처리해야 한다.
		}catch(FileNotFoundException e){
			System.out.println("해당 파일을 찾을 수 없습니다.");
			//파일명이 틀린 경우 처리해야 하는 코드를 명시
		}catch(IOException e) {
			System.out.println("파일을 읽을 수 없습니다.");
		}
	}
}
