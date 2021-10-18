package array;
//배열을 편하게 엑세스하기
public class ArrayTest04 {
	public static void main(String[] args) {
		String[] strArr = new String[100];
		strArr[0] = new String("java");
		//배열의 요소를 출력
		for(int i=0;i<=10;i++) {
			System.out.println(strArr[i]);
		}
		//배열의 요소의 갯수
		System.out.println("배열의 요소의 갯수=>"+strArr.length);
	}
}
