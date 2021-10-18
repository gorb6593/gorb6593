package statement;

public class For2DExam02 {

	public static void main(String[] args) {
		char alpha = 'A';
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {				
				if(i==j) {
					System.out.print("*\t");				
				}else {
					System.out.print(alpha+"\t");
				}
				alpha++;
			}
		System.out.println();
		}
	}		
}

