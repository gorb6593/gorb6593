package exam;

public class Account {
	String accNo;
	int balance;
	public String getAccNo() {
		return accNo;
	}	
	public int getBalance() {
		return balance;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
		System.out.println(accNo + "���°� �����Ǿ����ϴ�.");
	}
	public void save(int x) {
		balance = balance + x;
		System.out.println(accNo + "���¿�" + x + "������ �ԱݵǾ����ϴ�.");
	}
	public void deposit(int y) {
		balance = balance - y;
		System.out.println(accNo + "���¿�" + y + "������ ��ݵǾ����ϴ�.");
	}	
}

//������ Ǭ ����
//1.package ����
//2.accNo, balance �������� (accNo�� '-'�� ���Ե� ���̿��� String����
//balance�� �ƹ��� Ŀ�� int�� �����ص� �ɰͰ��Ƽ� int�� ����)
//3.getAccNo, getBalance ����(get�� ����ϴ� ������ ���ȸ���, set�� ���Ἲ�̷���?)
//�������� ������� �ؼ� ��������
//4.TestAcc 8���� ���� Account��� Ŭ������ accObj��� ���������� ����
//������ new�� ���ؼ� AccountŬ���� �ν��Ͻ��� �޸��� �� ������ �����
//9������ setAccNo��� ��������� ����
//10�� ���� ?