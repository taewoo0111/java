package test.mypac;

// 가상의 옛날 가정용 전화기 객체를 생성할 설계도라고 가정
public class Phone { // 상속을 하지 않으면 기본적으로 extends Object 가 기본적으로 들어가 있다.
	
	public Phone() {
		System.out.println("Phone 생성자 호출됨");
	}
	
	public void call() {
		System.out.println("전화를 걸어요!");
	}
}
