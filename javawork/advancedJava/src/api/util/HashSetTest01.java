package api.util;

import java.util.HashSet;
import java.util.Iterator;

//������ ���� - �ߺ��� ������ ����x
//�ڷᱸ���� �������� ����/�����Ⱑ �߿�
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
		System.out.println("����� ����:"+set.size());
		
		//set�� ���������� �ƴ϶� ������� ���� �� ����.(for���� �̿�Ұ���)
		//Iterator�� �ؾ���
		//1. HashSet�� Iterator�� ��ȯ
		Iterator<String> it = set.iterator();
		//2. Iterator�� ����� ������ �б�
		while(it.hasNext()) {//Iterator�ȿ� ������Ʈ�� �ִ��� ������ Ȯ��
			String element = it.next();
			System.out.println("set�� ����� ���=>"+element);
		}
	}
}
