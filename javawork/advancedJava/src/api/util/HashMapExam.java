package api.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExam {
	public static void main(String[] args) {
		//다음과 같은 데이터를 HashMap에 저장하고 출력해보자.
		//id-jang, pass-1234, name-장동건, addr-서울, point-1000, deptno-100
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("id", "jang");
		map.put("pass", "1234");
		map.put("name", "장동건");
		map.put("addr", "서울");
		map.put("point", "1000");
		map.put("deptno", "100");
		
		Set<String> keylist = map.keySet();
		Iterator<String> it = keylist.iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = map.get(key);
			System.out.println(key+":"+value);
		}
	}
}
