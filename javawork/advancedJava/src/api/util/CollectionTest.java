package api.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

//���� for���� �̿��Ͽ� List,Set,Map�� ������ �� �ִ�.
//jdk5.0���Ŀ� ��밡���ϵ��� 
//for(���� : collection��ü){
//	�ݺ��ؼ� ������ ��ɹ�
//}
public class CollectionTest {
	public static void main(String[] args) {
		//�迭
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
		map.put("name", "�嵿��");
		map.put("addr", "����");
		map.put("point", "1000");
		map.put("deptno", "100");
		Collection<String> changeMap = map.values();//map�� ����� ��� value�� Collection���� ����
		for(String data : changeMap) {
			System.out.println(data);
		}
	}
}
