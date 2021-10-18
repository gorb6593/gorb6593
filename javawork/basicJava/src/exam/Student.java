package exam;

public class Student {
	private String name;
	private int age;
	private int id;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setId(int id) {
		this.id = id;
	}	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getId() {
		return id;
	}
	public void abc() {
		 System.out.println("이 름 :"+ name+" 나 이 :"+ age + " 학 번 :" + id);
	 }
}
