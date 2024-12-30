package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import test.dto.MemberDto;
import test.util.DBConnector;

public class MainClass10 {
	public static void main(String[] args) {
		// 추가할 회원 정보라고 가정
		String name = "taewoo";
		String addr = "sunae";
		MemberDto dto = new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		
		boolean isSuccess = insert(dto);
		
		if (isSuccess) {
			System.out.println("회원 정보를 저장했습니다!");
		} else {
			System.out.println("저장을 실패했습니다.");
		}
	}
	
	// 매개변수에 전달된 MemberDto 객체에 담긴 name, addr 를 DB 에 저장하고
	// 작업의 성공여부를 리턴하는 메소드
	public static boolean insert(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		// 반환된 row 개수를 저장할 변수를 0을 대입해서 미리 만든다.
		int rowCount = 0;
		try {
			conn = new DBConnector().getConn();
			// 실행 할 미완성의 sql 문
			String sql = """
					insert into member
					(num, name, addr)
					values(member_seq.nextval, ?, ?)
					""";
			// 미완성의 sql 무을 전달하면서 PreparedStatement 객체의 참조값 얻어내기
			pstmt = conn.prepareStatement(sql);
			// ? 에 값 바인딩하기
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			// sql 문 실행하고 추가되거나, 변경되거나, 삭제된 row 의 개수리턴 받기
			rowCount = pstmt.executeUpdate(); // int 값이 row 의 개수로 리턴된다.
		} catch(SQLException se) {
			se.printStackTrace();
		} finally {
			try {
				if(pstmt !=null)pstmt.close();
				if(conn != null)conn.close();
			} catch (Exception e) {}
		}
		// rowCount 변수에 들어 있는 값을 확인해서 작업의 성공여부를 리턴해준다.
		if (rowCount > 0) {
			return true;
		} else {
			return false;
		}
	}
}
