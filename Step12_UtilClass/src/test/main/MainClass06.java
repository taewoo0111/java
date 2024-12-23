package test.main;

import java.util.ArrayList;
import java.util.List;
import test.mypac.MemberDto;

public class MainClass06 {
	public static void main(String[] args) {
		// MemberDto 객체를 담을 수 있는 ArrayList 객체 생성, 참조값 members
		List<MemberDto> members = new ArrayList<>();
		// 3명의 회원정보를 담기
		MemberDto m1 = new MemberDto(1,"김태우","수내동");
		MemberDto m2 = new MemberDto(2,"김구라","노량진");
		MemberDto m3 = new MemberDto(1,"정현우","서현동");
		// 객체의 참조값을 ArrayList에 담기
		members.add(m1);
		members.add(m2);
		members.add(m3);
		// 반복문을 이용해서 members 회원정보 출력
		for(MemberDto tmp: members) {
			String info = String.format("번호:%d 이름:%s 주소:%s", tmp.getNum(), tmp.getName(), tmp.getAddr());
			System.out.println(info);
		}
		
		// test 메소드 호출(매개 변수에 전달할 String type 의 개수는 유동적이다.)
		test();
		test("kim");
		test("kim", "lee", "park");
	}
	// ... test
	
	
	public static void test(String...msgs) {
		// String... 은 String[] type
		String[] a = msgs;
	}
}
