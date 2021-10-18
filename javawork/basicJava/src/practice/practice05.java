package practice;
//p.109
public class practice05 {
	public static void main(String[] args) {
		int num = 0;
		for(int i=1;i<=5;i++) {
			num = (int) (Math.random() * 6) + 1	;	
			System.out.println(num);
		}
	}
}
// okay