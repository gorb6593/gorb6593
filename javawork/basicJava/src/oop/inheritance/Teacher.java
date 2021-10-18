package oop.inheritance;

public class Teacher extends Person{	
	private String subject;
	public Teacher() {
			
	}
	public Teacher(String name, int age, String subject) {
		setName(name);
		this.age = age;
		this.subject = subject;
	}
	public void print() {
		System.out.println("�̸�"+getName()+"����:"+this.age+"������:"+this.subject);
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
				
}
