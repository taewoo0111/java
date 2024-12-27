package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import test.dto.EmpDto;
import test.util.DBConnector;

public class MainClass07 {
	public static void main(String[] args) {
		List<EmpDto> list = getList();
		for (EmpDto tmp : list) {
			System.out.printf("사원번호:%d 사원이름:%s 부서번호:%d 급여:%d \r\n", 
								tmp.getNum(), tmp.getName(), tmp.getDeptno(), tmp.getSal());
		}
	}
	public static List<EmpDto> getList(){
		List<EmpDto> list = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = new DBConnector().getConn(); // 우리가 설계한 클래스로 객체 생성 후 Connection 객체 얻어내기
			String sql = """
				select empno, ename, deptno, sal
				from emp	
				""";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int num = rs.getInt("empno");
				String name = rs.getString("ename");
				int deptno = rs.getInt("deptno");
				int sal = rs.getInt("sal");
				EmpDto dto = new EmpDto();
				dto.setNum(num);
				dto.setName(name);
				dto.setDeptno(deptno);
				dto.setSal(sal);
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}


