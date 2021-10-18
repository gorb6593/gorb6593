package statement;

public class Prob3 {

	public static void main(String[] args) {
		int count = 0;
		for(int a=2;a<=50;a++) {
			for(int b=2;b<=a;b++) {
				if(a%b==0) {
					count++;
				}					
			}
			if(count==1) {
				System.out.println(a);
			}
			count=0;
		}
	}
}
