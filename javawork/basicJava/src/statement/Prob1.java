package statement;

public class Prob1 {

	public static void main(String[] args) {
		int count = 0;
		int number = 0;	
		for(int i=1;i<=100;i++) {
			for(int j=2;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==1) {					
				System.out.println(i+"=> �Ҽ��Դϴ�.");
				number++;				
			}
			count=0;
		}
		System.out.println("�Ҽ��� ����=>"+number);
	}
}
