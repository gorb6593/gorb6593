package practice;
//p.168
public class practice02 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 값은 "+ t1.channel + "입니다.");
		System.out.println("t2의 값은 "+ t2.channel + "입니다.");
		
		t1.channel = 7;
		System.out.println("t1의 channel값을 7로 변겅하였습니다.");
		
		System.out.println("t1의 channel 값은 "+ t1.channel+ "입니다.");
		System.out.println("t2의 channel 값은 "+ t2.channel+ "입니다.");
	}
}


// 질문 1. Tv t1, t2는 설정한것이 없는데 이전 class에 정의한게 여기도 해당되는 건가요?
// 질문 2. 된다면 Tv라는 인스턴스의 값을 t2라는 참조변수로 Tv의 메서드를 이용하는 건가요?