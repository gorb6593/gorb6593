package array;

public class ArrayExam02 {

	public static void main(String[] args) {
		//int형 배열변수를 선언하고
		//98,100,78,99,86으로 초기화
		//배열에 저장된 점수의 합계와 평균을 출력하기
		//[출력형태]
		//배열요소의 총합:_____
		//배열요소의 평균:_____
		int[] a = new int[] {98,100,78,99,86};
		double avg = 0.0;
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum = sum + a[i];
		}
		avg = (double)sum/a.length;
		System.out.println("배열요소의 총합:"+sum);
		System.out.println("배열요소의 평균:"+(sum/a.length));
		System.out.println("배열요소의 평균:"+avg);
		}
		
	}

