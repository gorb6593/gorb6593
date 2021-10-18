package practice;
//p.137
public class practice06 {
	public static void main(String[] args) {
		int sum = 0;
		float average = 0f;
		
		int[] score = {100, 88, 100, 100, 90};
		
		for(int i=0;i<score.length;i++) {
			sum += score[i];
		}
		average = sum / (float)score.length;
		
		System.out.println("총합 : "+sum);
		System.out.println("평균 : "+average);
	}
}

//질문 1. 8줄 int[] score = {100, 88, 100, 100, 90};는

//			int[] score = new int[5]
//			score[0] = 100;
//			score[1] = 88;
//			score[2] = 100;
//			score[3] = 100;
//			score[4] = 90;  21~26줄이랑 똑같은 건가요?