package statement;
public class ForPractice {
	public static void main(String[] args) {
		/*
	 * 문제 0 
	 * 1부터 1000 까지의 홀수의 합,짝수의 합, 총합을 출력하세요 
	 * <출력형태> 1 부터 1000 까지의 총합________
	 * 1부터 1000 까지 홀수의 합_______ 
	 * 1부터 1000 까지 짝수의 합__________
	 */
		int sum = 0;
		int evenSum = 0;
		int oddSum = 0;
		for(int i=1;i<=1000;i++) {
			sum = sum+i;
			if(i%2==0) {
				evenSum = evenSum+i;
			}else {
				oddSum = oddSum+i;
			}
		}
		System.out.println("1부터 1000까지의 총합 :"+sum);
		System.out.println("1부터 1000까지 홀수의 합 :"+evenSum);
		System.out.println("1부터 1000까지 짝수의 합 :"+oddSum);
		
	}
}
