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
		System.out.println("이름"+getName()+"나이:"+this.age+"담당과목:"+this.subject);
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
				
}
