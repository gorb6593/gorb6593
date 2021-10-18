package jdbc;
/*
 * 테이블의 레코드를 모델링한 클래스
 * 프레임워크 내부에서 사용
 * 정해진 규칙이 있다.
 *   - public 클래스로 작성
 *   - 멤버변수는 private (테이블의 컬럼 - 변수명은 컬럼명과 동일)
 *   - public setter/getter만들기
 *   - 기본생성자 만들기
 *   - 매개변수가 있는 생성자 만들기
 *   - toString()메소드 오버라이딩하기
 */
public class MemberDTO {
	private String id;
	private String pass;
	private String name;
	private String addr;
	private int point;
	private String deptno;
	public MemberDTO() {
		
	}
	//update용
	public MemberDTO(String id, String addr) {
		super();
		this.id = id;
		this.addr = addr;
	}

	//insert용
	public MemberDTO(String id, String pass, 
			String name, String addr, String deptno) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.addr = addr;
		this.deptno = deptno;
	}

	//select용
	public MemberDTO(String id, String pass, String name, String addr, int point, String deptno) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.addr = addr;
		this.point = point;
		this.deptno = deptno;
	}

	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pass=" + pass + ", name=" + name + ", addr=" + addr + ", point=" + point
				+ ", deptno=" + deptno + "]";
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getDeptno() {
		return deptno;
	}
	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}
	
}
