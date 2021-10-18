package oop.inheritance;

public class Staff extends Person{	
	private String dept;
	public Staff() {
		
	}
	public Staff(String name, int age, String dept) {
		super();
		setName(name);
		//this.name = name;
		this.age = age;
		this.dept = dept;
	}	
	public void print() {
		System.out.println("이름"+getName()+"나이:"+this.age+"부서:"+this.dept);
	}	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
		
}

