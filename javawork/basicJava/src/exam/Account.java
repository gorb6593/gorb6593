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
		System.out.println(accNo + "계좌가 개설되었습니다.");
	}
	public void save(int x) {
		balance = balance + x;
		System.out.println(accNo + "계좌에" + x + "만원이 입금되었습니다.");
	}
	public void deposit(int y) {
		balance = balance - y;
		System.out.println(accNo + "게좌에" + y + "만원이 출금되었습니다.");
	}	
}

//문제를 푼 과정
//1.package 설정
//2.accNo, balance 변수설정 (accNo는 '-'이 포함된 글이여서 String으로
//balance는 아무리 커도 int로 설정해도 될것같아서 int로 설정)
//3.getAccNo, getBalance 설정(get을 사용하는 이유는 보안목적, set은 무결성이런거?)
//문제에서 적으라고 해서 적긴했음
//4.TestAcc 8번줄 보면 Account라는 클래스와 accObj라는 참조변수를 만듬
//연산자 new로 인해서 Account클래의 인스턴스가 메모리의 빈 공간에 생상됌
//9번줄은 setAccNo라는 멤버변수를 설정
//10번 줄은 ?