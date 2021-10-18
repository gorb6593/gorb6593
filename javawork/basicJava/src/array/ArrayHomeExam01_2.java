package array;

import java.util.Scanner;

public class ArrayHomeExam01_2 {

	public static void main(String[] args) {
		int[] myarr = new int[5];
		Scanner key = new Scanner(System.in);
		for(int i=0;i<myarr.length;i++) {
			System.out.println("배열요소에 저장될 값:");
			myarr[i] = key.nextInt();
		}
		for(int i=0;i<myarr.length;i++) {
			if(myarr[i]%2==0) {
				System.out.println("랜덤수로 :"+myarr[i]+"저장 -> 짝수");
			}else {
				System.out.println("랜덤수로 :"+myarr[i]+"저장 -> 홀수");
			}			
		}
	}
}