package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import test.dto.DeptDto;
import test.util.DBConnector;

public class MainClass08 {
	public static void main(String[] args) {
		List<DeptDto> list = getList();
		for (DeptDto tmp : list) {
			System.out.printf("부서번호:%d 부서이름:%s 부서위치:%s \r\n", 
								tmp.getDeptno(), tmp.getDname(), tmp.getLoc());
		}
	}
	public static List<DeptDto> getList(){
		List<DeptDto> list = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = new DBConnector().getConn(); // 우리가 설계한 클래스로 객체 생성 후 Connection 객체 얻어내기
			String sql = """
				select deptno, dname, loc
				from dept
				order by deptno asc
				""";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				DeptDto dto = new DeptDto();
				dto.setDeptno(rs.getInt("deptno"));
				dto.setDname(rs.getString("dname"));
				dto.setLoc(rs.getString("loc"));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
