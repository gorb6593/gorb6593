package oop.basic;

import java.util.Random;

//if~else�� ����
public class IfTest01 {
	public static void main(String[] args) {		
		Random rand = new Random();
		int num = rand.nextInt(100)+1;
		MyMethodUtil util = new MyMethodUtil();
		util.scoreCheck(num);
		//MyMethodUtilŬ������ ������ scoreCheckȣ��		
		
	}
}