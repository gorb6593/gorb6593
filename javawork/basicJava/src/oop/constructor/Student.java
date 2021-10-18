package oop.constructor;

public class Student {
	private String name;
	private int age;
	private int id;
	public Student() {
		
	}
	public Student(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}
	public void print() {
		System.out.println("이름"+this.name+"나이:"+this.age+"학번:"+this.id);
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
