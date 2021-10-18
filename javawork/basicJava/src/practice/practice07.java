package practice;

class Data{int x;}

public class practice07 {
//p.185
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change(int x) {
		x = 1000;
		System.out.println("change() : x = " + x);
	}
}
//질문 1. 8번줄 Data라는 클래스를 생성했고