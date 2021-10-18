package array;

public class ArgsExam {
	public static void main(String[] args) {	
		//숫자를 5개 입력 받아 합과 평균을 구해서 출력하세요.
		// - 설정하기
		// - for문으로 작업
		double avg = 0.0;
		int total = 0;
		for(int i=0;i<args.length;i++) {
			total = total + Integer.parseInt(args[i]);
		}
		avg = (double)total/args.length;
		System.out.println("배열요소의 총합:"+total);
		System.out.println("배열요소의 평균:"+(total/args.length));
		System.out.println("배열요소의 평균:"+avg);
	}
}
