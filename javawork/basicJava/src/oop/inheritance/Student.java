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
		System.out.println("이름"+getName()+"나이:"+this.age+"학번:"+this.id);
	}		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
