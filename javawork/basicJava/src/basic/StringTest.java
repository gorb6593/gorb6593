package basic;

public class StringTest {
	public static void main(String[] args) {
		String str = "java programming";
		//전체 문자열에서 문자를 추출하기 - String 클래스의 charAt을 이용
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		for(int i=0;i<str.length();i++) {
			System.out.println((char)(str.charAt(i)+1));
		}
	}
}
