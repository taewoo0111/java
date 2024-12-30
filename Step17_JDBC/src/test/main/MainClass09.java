package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import test.dto.EmpDeptDto;
import test.util.DBConnector;

public class MainClass09 {
	public static void main(String[] args) {
		List<EmpDeptDto> list = getList();
		for (EmpDeptDto tmp : list) {
			System.out.printf("사원번호:%d 사원이름:%s 부서번호:%d 부서이름:%s \r\n", 
								tmp.getEmpno(), tmp.getEname(), tmp.getDeptno(), tmp.getDname());
		}
	}
	public static List<EmpDeptDto> getList(){
		List<EmpDeptDto> list = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = new DBConnector().getConn(); // 우리가 설계한 클래스로 객체 생성 후 Connection 객체 얻어내기
			String sql = """
				select empno, ename, deptno, dname
				from emp
				inner join dept using(deptno)
				order by empno asc
				""";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				EmpDeptDto dto = new EmpDeptDto();
				dto.setEmpno(rs.getInt("empno"));
				dto.setEname(rs.getString("ename"));
				dto.setDeptno(rs.getInt("deptno"));
				dto.setDname(rs.getString("dname"));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
