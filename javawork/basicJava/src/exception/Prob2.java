package exception;

class BankCustomer{
	// ������ �� �а� �����ϼ���.
	String name;
	int currentMoney;
	public BankCustomer(String name, int currentMoney) {
		super();
		this.name = name;
		this.currentMoney = currentMoney;
	}
	public int getCurrentMoney() {
		return currentMoney;
	}
	public void withdraw(int i) {
		
	}
}
public class Prob2 {
	public static void main(String[] args) {
		try {
			BankCustomer customer = new BankCustomer("ȫ�浿", 100);
			System.out.println("���� �ܾ� : " + customer.getCurrentMoney());			
			customer.withdraw(70);
			System.out.println("���� �ܾ� : " + customer.getCurrentMoney());			
			customer.withdraw(50);
			System.out.println("���� �ܾ� : " + customer.getCurrentMoney());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

