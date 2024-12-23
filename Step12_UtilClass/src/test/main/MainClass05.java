package test.main;

import java.util.ArrayList;
import java.util.List;
import test.mypac.Member;

public class MainClass05 {
	public static void main(String[] args) {
		// Member 객체를 담을 수 있는 ArrayList 객체를 생성해서 참조값을 members 라는 List type 지역변수에 담기
		List<Member>members = new ArrayList<>();
		// 3명의 회원 정보를 객체에 각각 담기
		Member m1 = new Member(1,"김태우", "수내동");
		Member m2 = new Member(2,"김구라", "노량진");
		Member m3 = new Member(3,"정현우", "서현동");
		// 위에서 생성된 객체의 참조값을 List 객체에 담기
		members.add(m1);
		members.add(m2);
		members.add(m3);
		// 반복문 돌면서 출력
		for(Member tmp: members) {
			String info = String.format("번호:%d 이름:%s 주소:%s", tmp.num, tmp.name, tmp.addr);
			System.out.println(info);
		}
		
	}
}
