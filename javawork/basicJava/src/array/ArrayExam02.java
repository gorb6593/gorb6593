package array;

public class ArrayExam02 {

	public static void main(String[] args) {
		//int�� �迭������ �����ϰ�
		//98,100,78,99,86���� �ʱ�ȭ
		//�迭�� ����� ������ �հ�� ����� ����ϱ�
		//[�������]
		//�迭����� ����:_____
		//�迭����� ���:_____
		int[] a = new int[] {98,100,78,99,86};
		double avg = 0.0;
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum = sum + a[i];
		}
		avg = (double)sum/a.length;
		System.out.println("�迭����� ����:"+sum);
		System.out.println("�迭����� ���:"+(sum/a.length));
		System.out.println("�迭����� ���:"+avg);
		}
		
	}

