package exam;

public class TestSchool {
	public static void main(String[] args) {
		
		Student s = new Student();
		s.setName("ȫ�浿");
		s.setAge(20);
		s.setId(200201);
		Teacher t = new Teacher ();
		t.setName("�̼���");
		t.setAge(30);
		t.setSubject("JAVA");

		Staff  e = new Staff();
		e.setName("������");
		e.setAge(40);
		e.setDept("������");
					
		s.abc();
		t.print();
		e.print();
	}
}
