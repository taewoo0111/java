package test.main;

import test.mypac.Member;

public class MainClass10 {
	public static void main(String[] args) {
		
		Member m1 = new Member();
		m1.num(1);
		m1.name("김태우");
		m1.addr("수내동");
		
		Member m2 = new Member().num(2).name("해골").addr("행신동");
		
		Member m3 = new Member().num(3).name("원숭이").addr("분당");
		// new Member().num(3)이 실행되고 리턴 값으로 this 가 와서 계속 사용 가능
		
	}
}
