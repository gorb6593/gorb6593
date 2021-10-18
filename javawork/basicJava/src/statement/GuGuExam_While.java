package statement;

import java.util.Scanner;

public class GuGuExam_While {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);		
		System.out.print("출력할 단:");
		int dan = key.nextInt();
		int i = 1;
		while(i<=9) {
			System.out.println(dan+"*"+i+"="+(dan*i));
			i++;
		}
	}
	
}
