package oop.basic;

public class Person_MethodTest {
	public static void main(String[] args) {		
		Person_Method p1 = new Person_Method();
		//p.1객체의 setter메소드 호출
		p1.setName("장동건");
		p1.setAge(45);
		p1.setAddr("서울시");
		
		System.out.println("이름:"+p1.getName()+",나이:"+p1.getAge()+",주소:"+p1.getAddr());
		System.out.println("Person객체가 할당된 heap의 주소"+p1);
		
		Person_Method p2 = new Person_Method();
		p2.setName("김서연");
		p2.setAge(25);
		p2.setAddr("인천시");
		System.out.println("이름:"+p2.getName()+",나이:"+p2.getAge()+",주소:"+p2.getAddr());
		System.out.println("Person객체가 할당된 heap의 주소"+p2);
		
	}

}
