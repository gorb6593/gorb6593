package statement;

public class For2DExam01 {

	public static void main(String[] args) {
		int num=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(num++ +"\t");	
				num++;
			}
			System.out.println();
		}
			System.out.println("=====================================");
			int i = 0;
			int j = 0;
			for(i=1;i<=25;i++) {
				for(j=1;j<=5;j++) {
					System.out.print(i++ +"\t");				
				}
				System.out.println();
			}
	}

}
