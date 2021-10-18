package api.util;

import java.util.ArrayList;

public class ArrayListExam01 {
	public static void main(String[] args) {
		//78,99,100,95,100점을 ArrayList에 저장하고 총점과 평균을 구해서 출력하세요 - DM으로 제출하기
		//[출력형태]
		//ArrayList에 저장된 요소의 합:____
		//ArrayList에 저장된 요소의 평균:____
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(78);
		list.add(99);
		list.add(100);
		list.add(95);
		list.add(100);	
		int sum = 0;
		for(int i=0;i<list.size();i++) {
			sum = sum + list.get(i);
		}
			System.out.println("ArrayList에 저장된 요소의 합:"+sum);
			System.out.println("ArrayList에 저장된 요소의 평균:"+((double)sum/list.size()));
		}	
	}

