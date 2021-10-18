package array;
//가변형배열
//다차원배열을 사용하면서 배열의 사이즈를 다르게 선언하고 사용할 수 있다.
//배열의 사이즈를 처음부터 정해주지 않고 실행할때 생성해서 할당할 수 있도록 정의 가능
public class Array2DTest03 {
	public static void main(String[] args) {
		//가변형 배열을 만드는 경우 2차원배열인 경우라면 마지막 요소의 사이즈를 명시하지 않는다.
		char[][] myarr = new char[5][];
		myarr[0] = new char[1];
		myarr[1] = new char[2];
		myarr[2] = new char[3];
		myarr[3] = new char[4];
		myarr[4] = new char[5];
		
		//2차원 가변배열에 값을 할당
		for(int i=0;i<myarr.length;i++) {
			for(int j=0;j<myarr[i].length;j++) {
				myarr[i][j] = '*';	
		     }
     	}
	
		for(int i=0;i<myarr.length;i++) {
			for(int j=0;j<myarr[i].length;j++) {
				System.out.print(myarr[i][j]);
			}
			System.out.println();
		}
}
}
