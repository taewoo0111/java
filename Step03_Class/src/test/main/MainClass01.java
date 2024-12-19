package test.main;

import test.mypac.Car;

public class MainClass01 {
	// run 했을 때 실행의 흐름이 시작되는 main() 메소드
	public static void main(String[] args) {
		// Car 클래스로 객체를 생성하고 그 객체의 참조값을 c1 이라는 지역변수에 담기
		// new Car(); // Car 하고 control command space 누르기
		
		Car c1 = new Car(); // Car 클래스를 생성하면서 바로 c1 지역변수에 담기
		
		Car c2 = new Car();

		Car c3 = new Car();
	}
}
