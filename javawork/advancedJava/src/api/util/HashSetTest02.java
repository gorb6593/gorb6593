package api.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//집합을 표현한 자료구조 - 합집합과 교집합 이해하기
public class HashSetTest02 {
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
		
		//합집합 - Set객체를 생성할때 매개변수로 다른 Set객체를 전달해서 생성
		HashSet<String> set2 = new HashSet<String>(set);
		set2.add("spring");
		set2.add("hadoop");
		set2.add("R");
		print(set);
		print(set2);
		
		//교징합 - retainAll메소드를 이용해 교집합을 셋팅
		HashSet<String> set3 = new HashSet<String>();
		set3.add("java");
		set3.add("oracle");
		set3.add("raspberry");
		System.out.println("요소의 갯수:"+set3.size());
		set3.retainAll(set);// set3을 기준으로 set이랑 교집합
		print(set3);
	}
	//Set에 저장된 요소를 꺼내서 출력하는 메소드
	public static void print(Set<String> set) {
		Iterator<String> it = set.iterator(); //1.Iterator로 변환
		while(it.hasNext()) {//2. Iterator에 저장된 요소가 있는지 확인
			String element = it.next(); //3. Iterator에 저장된 요소를 꺼내기
			System.out.println("set에 저장된 요소=>"+element);			
		}
		System.out.println("====================================");
	}
}
