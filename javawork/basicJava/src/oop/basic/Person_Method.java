package oop.basic;

public class Person_Method {
	//멤버변수 or 필드
	private String name;
	private int age;
	private String addr;
	
	//name변수가 private으로 외부에서 접근불가로 설정되었기 때문에 public메소드를 통해 값을 셋팅하고 값을 전달할 수 있도록 정의한다.
	//name변수에 값을 세팅하는 메소드 - setter메소드
	//setter나 getter메소드명을 작성하는 방법
	//set(get) + 멤버변수명(멤버변수의 첫 글자를 대문자로 변경)
	//ex) name변수의 setter,getter메소드
	//	  setName, getName
	//    => 기본 자바에서는 setter/getter메소드의 이름을 명명할때 약속을 지키지 않아도 문제가 되지 않는다.
	//		 그러나 스프링이나 웹을 사용할때 이 규칙을 지키지 않으면 오류가 발생할 수 있다.
	//setter메소드의 매개변수는 값을 셋팅할 멤버변수와 타입이 동일해야 한다.
	public void setName(String name) {
		this.name = name; //가장 가까운 변수가 먼저 인식된다.
					 //멤버변수와 매개변수명이 동일한 경우 매개변수 = 매개변수로 인식되므로
					 //= 왼쪽의 변수는 객체의 변수임을 나타내야 한다. 이때 사용하는 키워드가 this
					 //this는 현재 작업 중인 객체를 의미
	}
	
	//name변수에 저장된 값을 읽을 수 있는 메소드(읽어서 호출하는 곳으로 보내줄 수 있는 메소드) - getter메소드
	//=> 멤버변수의 값을 호출하는 곳으로 보낸다.
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getAddr() {
		return this.addr;
	}
}
