package exam;

public class TestSchool {
	public static void main(String[] args) {
		
		Student s = new Student();
		s.setName("홍길동");
		s.setAge(20);
		s.setId(200201);
		Teacher t = new Teacher ();
		t.setName("이순신");
		t.setAge(30);
		t.setSubject("JAVA");

		Staff  e = new Staff();
		e.setName("유관순");
		e.setAge(40);
		e.setDept("교무과");
					
		s.abc();
		t.print();
		e.print();
	}
}
