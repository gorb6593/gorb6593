package statement;
//구구단출력하기
public class GuGu {
	public static void main(String[] args) {
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.println();
		}
	}
}
