package statement;
//for문을 중첩해서 사용하기
public class ForTest2 {
	public static void main(String[] args) {
		for(int row=1;row<=5;row++) {
		for(int i=1;i<=5;i++) {
			System.out.print("*");			
		}
		System.out.println();
		}
	}
}
