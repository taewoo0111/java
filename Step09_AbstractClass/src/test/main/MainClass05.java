package test.main;

import test.mypac.Weapon;

public class MainClass05 {
	public static void main(String[] args) {
		Weapon w1 = new Weapon() { 

			@Override
			public void attack() {
				System.out.println("몰라 아무데나 공격해~");
			}
			
		}; // {}; 익명 class class ? extends Weapon{}
		// 익명 클래스 사용 이유
		// 1. 한 번만 사용할 클래스이므로 간단하게 작성 가능
		// 2. 인터페이스나 추상클래스를 구현하고 한 번만 사용할 때 코드 중복을 줄일 수 있다.
		// 3. 클래스 정의와 객체 생성을 동시에 가능 = 코드가 한줄로 나와서 간단함
		useWeapon(w1);
		
		useWeapon(new Weapon() {
			@Override
			public void attack() {
				System.out.println("김구라를 공격하자~~");
			}
			
		});
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
