package test.mypac;

// 미완성된 추상메소드를 멤버를 가지고 있는 클래스는 abstract 예약어를 사용해서 정의해야 한다.
public abstract class Weapon {
	
	public void prepare() {
		System.out.println("무기 작동을 준비합니다.");
	}
	
	// 공격을 하는 메소드의 모양만 정의하고 실제 구현은 하지 않기
	// 미완성된 추상메소드를 만들 때는 abstract 예약어 사용!
	public abstract void attack();
}
