package statement;
public class HapExam {
	public static void main(String[] args) {
		int sum = 0;
		int evenSum = 0;
		int oddSum = 0;
		for(int i=1;i<=100;i++) {
			sum = sum+i;
			//System.out.println("sum="+sum+",i="+i);
			if(i%2==0) {	
				evenSum = evenSum+i;
			}else {
				oddSum = oddSum +i;
			}
		}
		System.out.println("ÃÑÇÕ:"+sum);
		System.out.println("Â¦¼öÇÕ:"+evenSum);
		System.out.println("È¦¼öÇÕ:"+oddSum);

	}

}
