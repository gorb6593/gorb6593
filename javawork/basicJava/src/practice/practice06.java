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
		
		System.out.println("���� : "+sum);
		System.out.println("��� : "+average);
	}
}

//���� 1. 8�� int[] score = {100, 88, 100, 100, 90};��

//			int[] score = new int[5]
//			score[0] = 100;
//			score[1] = 88;
//			score[2] = 100;
//			score[3] = 100;
//			score[4] = 90;  21~26���̶� �Ȱ��� �ǰ���?