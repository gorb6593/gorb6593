package api.util;

import java.util.ArrayList;

public class ArrayListTest01 {
	public static void main(String[] args) {		
		ArrayList<Integer> v = new ArrayList<Integer>();
		v.add(10);	
		System.out.println("현재 ArrayList에 저장된 요소 갯수=>"+v.size());
		
		for(int i=0;i<=10;i++) {
			v.add(i);
		}		
		System.out.println("현재 ArrayList에 저장된 요소 갯수=>"+v.size());
		
		System.out.println("ArrayList의 0번 요소=>"+v.get(0));
		
		for (int i=0;i<v.size();i++) {
			int data = v.get(i); //오토언박싱 - 자동으로 컴파일러가 Interger객체를 int로 변환해서 변수에 저장
			System.out.println(i+"번째 요소=>"+data);
		}
	}
}
