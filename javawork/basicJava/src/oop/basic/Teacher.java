package oop.basic;

public class Teacher {
	private String name;
	private int age;
	private String subject;
	
	public void print() {
		System.out.println("이름"+this.name+"나이:"+this.age+"담당과목:"+this.subject);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
				
}
