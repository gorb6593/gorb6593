package array;

public class Array2DExam01 {

	public static void main(String[] args) {		
		int[][] mynumArr = new int[5][5];
		
		int num = 1;
		//2차원배열에 값을 저장
		for(int i=0;i<mynumArr.length;i++) {
			for(int j=0;j<mynumArr[i].length;j++) {
				mynumArr[i][j] = num;
				num++;
			}
		}
		
		
		//2차원배열에 저장된 값을 꺼내서 출력하기
		for(int i=0;i<mynumArr.length;i++) {
			for(int j=0;j<mynumArr[i].length;j++) {
				System.out.print(mynumArr[i][j]+"\t");
			}
			System.out.println();
		}
}
}