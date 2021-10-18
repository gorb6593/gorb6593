package api.util;

import java.util.ArrayList;

public class ArrayListTest02 {
	public static void main(String[] args) {
		//String데이터가 저장될 ArrayList를 생성하고
		//java,oracle,swing,servlet,jsp의 문자열을 저장
		//ArrayList에 저장된 모든 요소를 출력하기
		//DM으로 전송
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
