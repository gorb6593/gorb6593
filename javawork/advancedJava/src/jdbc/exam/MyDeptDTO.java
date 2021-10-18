package jdbc.exam;

public class MyDeptDTO {
	private String deptno;
	private String deptname;
	private String loc;
	private String mgr;
	public MyDeptDTO() {
		
	}
	//update
	public MyDeptDTO(String deptno, String loc) {
		super();
		this.deptno = deptno;
		this.loc = loc;
	}

	//select,insert
	public MyDeptDTO(String deptno, String deptname, String loc, String mgr) {
		super();
		this.deptno = deptno;
		this.deptname = deptname;
		this.loc = loc;
		this.mgr = mgr;
	}

	public String toString() {
		return "MyDeptDTO [deptno=" + deptno + ", deptname=" + deptname + ", loc=" + loc + ", mgr=" + mgr + "]";
	}
	public String getDeptno() {
		return deptno;
	}
	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getMgr() {
		return mgr;
	}
	public void setMgr(String mgr) {
		this.mgr = mgr;
	}
}
