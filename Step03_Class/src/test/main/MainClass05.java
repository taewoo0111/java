package test.main;

import test.mypac.Car;

public class MainClass05 {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.name = "쏘나타";
		car1.drive();
		// Car 객체를 생성해서 메소드 호출하고 참조값은 더 이상 사용할 수 없다. 일회용!!!!!!!
		new Car().drive(); 
		
	}
}
