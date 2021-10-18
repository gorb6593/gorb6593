package oop.inheritance;

public class Student extends Person{	
	private int id;
	public Student() {
		
	}
	public Student(String name, int age, int id) {
		setName(name);
		this.age = age;
		this.id = id;
	}
	public void print() {
		System.out.println("�̸�"+getName()+"����:"+this.age+"�й�:"+this.id);
	}		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
