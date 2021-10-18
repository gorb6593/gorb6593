package api.lang;
//String클래스의 주요 메소드
public class StringTest04 {
	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("재밌다");
		System.out.println("str1.substring(5)=>"+str1.substring(5));
		System.out.println("str1.substring(5,8)=>"+str1.substring(5,8));
		System.out.println("str1.replace('a','A')=>"+str1.replace('a','A'));
		System.out.println("문자열원본=>"+str1);
	}
}
