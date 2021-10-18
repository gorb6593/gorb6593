package array;
//2차원배열의 선언과 생성과 초기화를 한 번에 작업하기
public class Array2DTest02 {
	public static void main(String[] args) {
		int[][] data = { //data = new int[4][5];
							{97,88,77,66,88},
							{100,88,95,66,77},
							{95,99,77,66,56},
							{89,98,77,66,100}
						};
		int[][] date2 = new int[][] { //data = new int[4][5];
			{97,88,77,66,88},
			{100,88,95,66,77},
			{95,99,77,66,56},
			{89,98,77,66,100}
		};
		//1차원배열 hapdata를 선언하고 2차원배열(data)의 각 요소에 참조하는 배열의 전체 합을 저장하고 출력하세요
		//0. hapdata 1차원배열 선언하기
		int[] hapdata = new int[data.length];
		int sum = 0;
		for(int i=0;i<data.length;i++) {
			sum = 0;
			for(int j=0;j<data[i].length;j++) {
				//1. 2중 for문 안에서 2차원배열의 각 요소의 합을 구한다.
			sum = sum + data[i][j];
			}
			//2. hapdata에 1번에서 더한 결과를 저장
			hapdata[i] = sum;
		}
		//1. 2중for문 안에서 2차원배열의 각 요소의 합을 구한다.
		//2. hapdata에 1번에서 더한 결과를 저장
		//3. 새로운for문으로 hapdata에 저장된 각 합을 출력하기
		for(int i=0;i<hapdata.length;i++) {
			System.out.print(hapdata[i]+"\t");
			
		}
	}
}
