package oop.constructor;
//Movie클래스와 TestMovie, 실행화면캡쳐 후 메일로 전송
public class TestMovie { 
	public static void main(String[] args) { 
		Movie myMovie = new Movie("어거스트 러쉬","Drama");
		myMovie.play();
		
		System.out.println("--------------------");

		Movie yourMovie = new Movie("나는 전설이다","SF");
		yourMovie.play();
	}

}