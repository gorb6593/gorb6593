package oop.basic;
public class ArrayExam03 {
	public static void main(String[] args) {	
		
		int[] ia = new int[]{3,7,1,8,10,2,15,2,10}; 
		int[] ib = new int[]{1,2,3,4,5};
		int[] ic = new int[]{1,2,3,4,5,6,7,8,9,10};
		
		MyMethodUtil obj = new MyMethodUtil();
		
		//ia배열의 합
		obj.printArray(ia, "ia");
		//ib배열의 합
		obj.printArray(ib, "ib");
		//ic배열의 합
		obj.printArray(ic, "ic");
	}	
}
