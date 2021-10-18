package oop.constructor;

public class MyConstructor {
	private String name;
	private String id;
	private String pass;
	private String addr;
	private String telNum;
	private String ssn;
	private String nickname;

	public MyConstructor() {
		System.out.println("기본생성자 - 매개변수없는 생성자");
	}	 
	public MyConstructor(String name, String id, String pass) {
		this.name = name;
		this.id = id;
		this.pass = pass;
		System.out.println("매개변수3개생성자");
	}

	public MyConstructor(String name, String id, String pass, String addr, String telNum) {
		this.name = name;
		this.id = id;
		this.pass = pass;
		this.addr = addr;
		this.telNum = telNum;
		System.out.println("매개변수5개생성자");
	}

	public MyConstructor(String name, String id, String pass, String addr, String telNum, String ssn, String nickname) {
		// 멤버변수를 초기화하기 위한 코드를 반복해서 사용하지 않고 기존에 작성된 생성자를 호출해서 사용할 수 있다.
		this(name, id, pass, addr, telNum);// name은 String, id는 String, pass는 String이므로 MyConstructor클래스에서 String타입으로
											// 매개변수
		// 세 개로 정의된 생성자를 찾아서 호출한다.
		this.ssn = ssn;
		this.nickname = nickname;
		System.out.println("매개변수7개생성자");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTelNum() {
		return telNum;
	}

	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public void print() {
		System.out.println("name=" + name + ",id=" + id + ",addr=" + addr + ",nickname=" + nickname);
	}
}
