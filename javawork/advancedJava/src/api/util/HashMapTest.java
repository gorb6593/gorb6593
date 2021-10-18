package api.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

//key와 value의 형태로 저장되는 데이터
//key와 value의 데이터타입을 모두 명시
public class HashMapTest {
	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		//HashMap에서 동일한 키로 데이터를 put하면 덮어쓰기가 된다. - 키는 중복될 수 없다.
		map1.put(1, "swing");
		map1.put(1, "oracle");
		map1.put(1, "java");
		System.out.println(map1.size());//map1에 저장된 요소의 갯수 리턴
		System.out.println(map1.get(1));//map1에 저장된 요소 중 key값이 1인 데이터의 value를 리턴
		
		System.out.println("===============================");
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("1", "swing");
		map2.put("2", "jsp");
		map2.put("3", "spring");
		map2.put("4", "mybatis");
		map2.put("5", "ajax");
		System.out.println(map2.size());
		System.out.println(map2.get("1"));
		System.out.println("===============================");
		//HashMap에 저장된 데이터를 모두 꺼내서 출력하기
		//1. map에 저장된 모든 키를 꺼내기 - 저장된 모든 Key를 Set으로 변환하기
		Set<String> keylist = map2.keySet();
		
		//2. Set으로 변환된 keylist를 Iterator로 변환하기
		Iterator<String> it = keylist.iterator();
		
		//3. Iterator에 저장된 key목록을 이용해서 HashMap에서 value를 추출
		while(it.hasNext()) {
			String key = it.next();
			String value = map2.get(key);
			System.out.println(key+":"+value);
		}
	}
}
