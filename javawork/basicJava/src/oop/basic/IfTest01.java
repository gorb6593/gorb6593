package oop.basic;

import java.util.Random;

//if~else를 연습
public class IfTest01 {
	public static void main(String[] args) {		
		Random rand = new Random();
		int num = rand.nextInt(100)+1;
		MyMethodUtil util = new MyMethodUtil();
		util.scoreCheck(num);
		//MyMethodUtil클래스에 정의한 scoreCheck호출		
		
	}
}
