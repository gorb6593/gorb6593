package oop.inheritance;

public class BeverageTest {
	public static void main(String[] args) {
        Coffee coffee1 = new Coffee("Ŀ��",2500,"�Ƹ޸�ī��");
        Coffee coffee2 = new Coffee("Ŀ��",2700,"ī���");
        Coffee coffee3 = new Coffee("Ŀ��",3000,"īǪġ��");
        
        Coffee tea1 = new Coffee("��",2500,"�𽺹���");
        Coffee tea2 = new Coffee("��",2700,"�λ���");
        Coffee tea3 = new Coffee("��",3000,"��ȭ��");
        coffee1.print();
        coffee2.print();
        coffee3.print();
        tea1.print();
        tea2.print();
        tea3.print();
        
        
	}

}
