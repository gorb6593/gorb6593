package array;
//�迭�� ���ϰ� �������ϱ�
public class ArrayTest04 {
	public static void main(String[] args) {
		String[] strArr = new String[100];
		strArr[0] = new String("java");
		//�迭�� ��Ҹ� ���
		for(int i=0;i<=10;i++) {
			System.out.println(strArr[i]);
		}
		//�迭�� ����� ����
		System.out.println("�迭�� ����� ����=>"+strArr.length);
	}
}
