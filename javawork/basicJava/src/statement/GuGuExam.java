package statement;

import java.util.Scanner;
public class GuGuExam {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("����� ��:");
		int dan = key.nextInt();
		
		for(int i=1;i<=9;i++) {
			System.out.println(dan+"*"+i+"="+(dan*1));
		}

}
}