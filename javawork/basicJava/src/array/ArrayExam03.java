package array;

public class ArrayExam03 {

	public static void main(String[] args) {		
		int[] ia = new int[]{3,7,1,8,10,2,15,2,10}; 
		int[] ib = new int[]{1,2,3,4,5};
		
		int sum = 0;
		int evensum = 0;
		int oddsum = 0;
		
		for(int i=0;i<ia.length;i++) {
			sum = sum + ia[i];
			
			if(ia[i]%2==0) {
				evensum = evensum + ia[i];
			}else {
				oddsum = oddsum + ia[i];
			}
		}
		System.out.println("(�迭 ia)");
		System.out.println("Ȧ������ : "+oddsum);
		System.out.println("¦������ : "+evensum);
		
		
		evensum = 0;
		oddsum = 0;
		for(int i=0;i<ib.length;i++) {
			if(ib[i]%2==0) {
				evensum = evensum + ib[i];
			}else {
				oddsum = oddsum + ib[i];
			}
		}
		System.out.println("(�迭 ib)");
		System.out.println("Ȧ������ : "+oddsum);
		System.out.println("¦������ : "+evensum);
		
	}

}
