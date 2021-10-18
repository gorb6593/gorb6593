package api.util;

import java.util.Vector;

// List������ ���� Ŭ������ Vector�� �����
public class VectorTest01 {
	public static void main(String[] args) {
		//1. Vector�� ���� - 5.0���� <> �ȿ� Vector�� ����Ǵ� Ÿ�� ����� ��
		//=> Vector�ȿ� ����Ǵ� ������ Ÿ�� ����(�⺻���� ��� WrapperŸ���� ���)
		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		System.out.println("���� Vector�� �뷮=>"+v.capacity());
		System.out.println("���� Vector�� ����� ��� ����=>"+v.size());
		
		for(int i=0;i<=10;i++) {
			v.add(i);
		}
		System.out.println("���� Vector�� �뷮=>"+v.capacity());
		System.out.println("���� Vector�� ����� ��� ����=>"+v.size());
		
		System.out.println("Vector�� 0�� ���=>"+v.get(0));
		//Vector�� ����� ��� ��� ������ - ���������� ��, �迭�� ������ ������ ���� �ִ� �ڷᱸ��(for�� �̿�)
		for (int i=0;i<v.size();i++) {
			int data = v.get(i); //�����ڽ� - �ڵ����� �����Ϸ��� Interger��ü�� int�� ��ȯ�ؼ� ������ ����
			System.out.println(i+"��° ���=>"+data);
		}
	}
}
