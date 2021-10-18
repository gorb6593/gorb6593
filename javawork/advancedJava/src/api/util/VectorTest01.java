package api.util;

import java.util.Vector;

// List구조의 하위 클래스인 Vector의 사용방법
public class VectorTest01 {
	public static void main(String[] args) {
		//1. Vector의 생성 - 5.0이후 <> 안에 Vector에 저장되는 타입 명시할 것
		//=> Vector안에 저장되는 데이터 타입 제한(기본형인 경우 Wrapper타입을 명시)
		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		System.out.println("현재 Vector의 용량=>"+v.capacity());
		System.out.println("현재 Vector에 저장된 요소 갯수=>"+v.size());
		
		for(int i=0;i<=10;i++) {
			v.add(i);
		}
		System.out.println("현재 Vector의 용량=>"+v.capacity());
		System.out.println("현재 Vector에 저장된 요소 갯수=>"+v.size());
		
		System.out.println("Vector의 0번 요소=>"+v.get(0));
		//Vector에 저장된 모든 요소 꺼내기 - 선형구조임 즉, 배열과 동일한 구조를 갖고 있는 자료구조(for문 이용)
		for (int i=0;i<v.size();i++) {
			int data = v.get(i); //오토언박싱 - 자동으로 컴파일러가 Interger객체를 int로 변환해서 변수에 저장
			System.out.println(i+"번째 요소=>"+data);
		}
	}
}
