package api.basic;

import java.util.Scanner;

//Scaaner클래스의 기본 사용방법 => 직접 입력을 받은 데이터를 평가
//==> 표준입력으로 입력된 값을 읽어서 리턴하는 기능을 가지고 있는 API의 클래스
//표준입력 System.in 키보드로 입력
//표준출력 System.out
public class ScannerTest {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("키보드를 이용해서 문장을 입력해보세요:");
		//전체 문장을 읽어서 리턴
		String line = key.nextLine();
		System.out.println("사용자가 입력한 문장=>"+line);
		
		//단어읽기
		//=> spacebar나 enter키가 입력되기 전까지 입력한 단어를 읽어서 리턴
		String data = key.next();
		System.out.println("입력받은 단어=>"+data);
		//정수읽기
		int num = key.nextInt();
		System.out.println("입력받은 숫자=>"+num);
		//실수읽기
		double doubleVal = key.nextDouble();
		System.out.println("입력받은 실수=>"+doubleVal);
	}

}
