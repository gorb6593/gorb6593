package api.util;

import java.util.ArrayList;

public class ArrayListTest02 {
	public static void main(String[] args) {
		//String�����Ͱ� ����� ArrayList�� �����ϰ�
		//java,oracle,swing,servlet,jsp�� ���ڿ��� ����
		//ArrayList�� ����� ��� ��Ҹ� ����ϱ�
		//DM���� ����
		ArrayList<String> v = new ArrayList<String>();		
		v.add("java");
		v.add("oracle");
		v.add("swing");
		v.add("servlet");
		v.add("jsp");
		
		for(int i=0; i<v.size();i++) {			
			System.out.println(v.get(i));
		}
	}
}
