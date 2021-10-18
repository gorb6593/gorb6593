package statement;
//HapExam을 while문으로 변경하기
public class HapExam_While {

	public static void main(String[] args) {
		int sum = 0;
		int evenSum = 0;
		int oddSum = 0;
		int i=1;
		while(i<=100) { //1부터 100까지 반복해서 실행하며 작업
			sum = sum+i;
			if(i%2==0) {
				evenSum = evenSum+i;
			}else {
				oddSum = oddSum+i;
			}
			i++;
		}
		System.out.println("총합:"+sum);
		System.out.println("짝수합:"+evenSum);
		System.out.println("홀수합:"+oddSum);
	}

}
