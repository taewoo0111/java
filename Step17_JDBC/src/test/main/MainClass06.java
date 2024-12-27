package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.util.DBConnector;

public class MainClass06 {
	public static void main(String[] args) {
		List<MemberDto> list = getList();
		for (MemberDto tmp : list) {
			System.out.printf("번호:%d 이름:%s 주소:%s \r\n", tmp.getNum(), tmp.getName(), tmp.getAddr());
		}
	}
	public static List<MemberDto> getList(){
		List<MemberDto> list = new ArrayList<>();
		
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
				MemberDto dto = new MemberDto();
				dto.setNum(num);
				dto.setName(name);
				dto.setAddr(addr);
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}

