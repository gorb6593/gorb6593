package api.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

//향상된 for문을 이용하여 List,Set,Map을 접근할 수 있다.
//jdk5.0이후에 사용가능하도록 
//for(변수 : collection객체){
//	반복해서 실행할 명령문
//}
public class CollectionTest {
	public static void main(String[] args) {
		//배열
		int[] arr = new int[] {10,20,30,40,50};
		for(int i : arr) {
			System.out.println(i);
		}
		ArrayList<String> v = new ArrayList<String>();		
		v.add("java");
		v.add("oracle");
		v.add("swing");
		v.add("servlet");
		v.add("jsp");
		for(String data : v) {
			System.out.println(data);
		}
		
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("oracle");
		set.add("swing");
		set.add("servlet");
		set.add("jsp");
		for(String data : set) {
			System.out.println(data);
		}
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("id", "jang");
		map.put("pass", "1234");
		map.put("name", "장동건");
		map.put("addr", "서울");
		map.put("point", "1000");
		map.put("deptno", "100");
		Collection<String> changeMap = map.values();//map에 저장된 모든 value를 Collection으로 리턴
		for(String data : changeMap) {
			System.out.println(data);
		}
	}
}
