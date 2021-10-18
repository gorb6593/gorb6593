package jdbc.exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class MyDeptDAO {
	public ArrayList<MyDeptDTO> getDeptList(){
		ArrayList<MyDeptDTO> deptlist = new ArrayList<MyDeptDTO>();
		MyDeptDTO dept = null;
		String sql = "select * from mydept";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next()) {
				dept = new MyDeptDTO(rs.getString(1),rs.getString(2), rs.getString(3), rs.getString(4));
				deptlist.add(dept);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(rs, stmt, con);
		}
		return deptlist;
	}
	
	
	
	public ArrayList<MyDeptDTO> findByDeptName(String deptname){
		ArrayList<MyDeptDTO> deptlist = new ArrayList<MyDeptDTO>();
		MyDeptDTO dept = null;
		String sql = "select * from mydept where deptname like ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			//?에 대한 값 설정
			stmt.setString(1, "%"+deptname+"%");
			rs = stmt.executeQuery();
			while(rs.next()) {
				dept = new MyDeptDTO(rs.getString(1),rs.getString(2), 
						rs.getString(3), rs.getString(4));
				deptlist.add(dept);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(rs, stmt, con);
		}
		return deptlist;
	}
	
	public ArrayList<MyDeptDTO> findByLoc(String loc){
		ArrayList<MyDeptDTO> deptlist = new ArrayList<MyDeptDTO>();
		MyDeptDTO dept = null;
		String sql = "select * from mydept where loc = ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			//?에 대한 값 설정
			stmt.setString(1, loc);
			rs = stmt.executeQuery();
			while(rs.next()) {
				dept = new MyDeptDTO(rs.getString(1),rs.getString(2), 
						rs.getString(3), rs.getString(4));
				deptlist.add(dept);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(rs, stmt, con);
		}
		return deptlist;
	}
}
