package statement;
public class ForPractice {
	public static void main(String[] args) {
		/*
	 * ���� 0 
	 * 1���� 1000 ������ Ȧ���� ��,¦���� ��, ������ ����ϼ��� 
	 * <�������> 1 ���� 1000 ������ ����________
	 * 1���� 1000 ���� Ȧ���� ��_______ 
	 * 1���� 1000 ���� ¦���� ��__________
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
		System.out.println("1���� 1000������ ���� :"+sum);
		System.out.println("1���� 1000���� Ȧ���� �� :"+evenSum);
		System.out.println("1���� 1000���� ¦���� �� :"+oddSum);
		
	}
}
