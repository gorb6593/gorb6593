package api.util;

import java.util.HashSet;
import java.util.Iterator;

//집합의 구조 - 중복된 데이터 저장x
//자료구조는 데이터의 저장/꺼내기가 중요
public class HashSetTest01 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("oracle");
		set.add("swing");
		set.add("servlet");
		set.add("jsp");
		set.add("java");
		set.add("oracle");
		set.add("swing");
		System.out.println("요소의 갯수:"+set.size());
		
		//set은 선형구조가 아니라 순서대로 읽을 수 없다.(for문을 이용불가능)
		//Iterator로 해야함
		//1. HashSet을 Iterator로 변환
		Iterator<String> it = set.iterator();
		//2. Iterator에 저장된 데이터 읽기
		while(it.hasNext()) {//Iterator안에 엘리먼트가 있는지 없는지 확인
			String element = it.next();
			System.out.println("set에 저장된 요소=>"+element);
		}
	}
}
