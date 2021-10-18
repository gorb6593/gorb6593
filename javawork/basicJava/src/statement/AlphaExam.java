package statement;
public class AlphaExam {
	public static void main(String[] args) {
		//ABCDF....Z
		char c = 'A';
		System.out.println((int)c);
		for(int i=65;i<=90;i++){
			System.out.println((char)i);
		}
		System.out.println();
		for(char alpha='A';alpha<='Z';alpha++) {
			System.out.println(alpha);
		}
	}

}
