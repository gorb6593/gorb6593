package oop.basic;

import java.util.Scanner;

public class HapExam {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("1부터 사이 합을 구하고 싶은 숫자를 입력하세요:");
		int num = key.nextInt();
		int sum = 0;
		
		MyMethodUtil obj = new MyMethodUtil();
		sum = obj.getHap(num);
		System.out.println("총합:"+sum);
		
	}

}
