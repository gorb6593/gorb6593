package api.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExam {
	public static void main(String[] args) {
		//������ ���� �����͸� HashMap�� �����ϰ� ����غ���.
		//id-jang, pass-1234, name-�嵿��, addr-����, point-1000, deptno-100
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("id", "jang");
		map.put("pass", "1234");
		map.put("name", "�嵿��");
		map.put("addr", "����");
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
