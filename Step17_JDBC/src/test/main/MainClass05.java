package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import test.util.DBConnector;

public class MainClass05 {
	public static void main(String[] args) {
		// 회원 목록을 불러와서 콘솔에 출력하기
		
		// 필요한 객체를 담을 지역변수 미리 준비
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = new DBConnector().getConn(); // 우리가 설계한 클래스로 객체 생성 후 Connection 객체 얻어내기
			String sql = """
				select num, name, addr
				from member
				order by num asc	
			""";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				System.out.printf("번호: %d 이름:%s 주소:%s ", num, name, addr);
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
